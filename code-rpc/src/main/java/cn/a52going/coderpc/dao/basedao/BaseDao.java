package cn.a52going.coderpc.dao.basedao;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import cn.a52going.coderpc.plugin.page.Pager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
public abstract class BaseDao<T> {
    protected Log logger = LogFactory.getLog(this.getClass().getSimpleName());
    protected String namespace;
    private int warningTime = 500;
    protected SqlSessionTemplate sqlSessionTemplate;

    public BaseDao() {
    }

    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace.concat(".");
    }

    public SqlSessionTemplate getSqlSessionTemplate() {
        return this.sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public Pager<T> findByPage(String sqlId, String sqlCountId, int pageSize, int pageNo, Object params) {
        Pager<T> pager = new Pager(pageNo, pageSize);
        this.logger.debug(sqlId + "<<<<<start>>>>>");
        long startmils = System.currentTimeMillis();
        int totalCount = ((Integer)this.getSqlSessionTemplate().selectOne(this.getNamespace().concat(sqlCountId), params)).intValue();
        this.logger.debug("数据总条数：" + totalCount);
        long startmils2 = System.currentTimeMillis();
        long offmils1 = startmils2 - startmils;
        this.logger.debug(sqlId + "<<<<<end>>>>> 查询结果集费时：" + offmils1 + " ms");
        if (totalCount >= 1) {
            if (totalCount > pageSize * (pageNo - 1)) {
                RowBounds rowBounds = new RowBounds(pager.getPageSize() * (pager.getCurPage() - 1), pager.getPageSize());
                List<T> resultRows = this.getSqlSessionTemplate().selectList(this.getNamespace().concat(sqlId), params, rowBounds);
                this.logger.debug("本次查询第" + pager.getCurPage() + "页，每页大小设定" + pager.getPageSize() + "条,本次返回条数为：" + resultRows.size());
                pager.setTotalCount(totalCount);
                pager.setResultList(resultRows);
                long startmils3 = System.currentTimeMillis();
                long offmils2 = startmils3 - startmils2;
                if (offmils2 >= (long)this.warningTime) {
                    this.logger.warn(sqlId + " 查询结果集费时 超过警告时间：" + offmils2 + " ms");
                }

                this.logger.debug(sqlId + "<<<<<end>>>>> 查询结果集费时：" + offmils2 + " ms");
                return pager;
            }

            pager.setResultList(Collections.EMPTY_LIST);
            pager.setTotalCount(0);
        } else {
            pager.setResultList(Collections.EMPTY_LIST);
            pager.setTotalCount(0);
        }

        return pager;
    }

    public List<T> findList(String sqlId, int pageSize, int pageNo, Object params) {
        this.logger.debug(sqlId + "<<<<<start>>>>>");
        long startmils = System.currentTimeMillis();
        RowBounds rowBounds = new RowBounds(pageSize * (pageNo - 1), pageSize);
        List<T> resultRows = this.getSqlSessionTemplate().selectList(this.getNamespace().concat(sqlId), params, rowBounds);
        this.logger.debug(sqlId + "查询到结果集 list size:" + resultRows.size());
        long startmils3 = System.currentTimeMillis();
        long offmils = startmils3 - startmils;
        if (offmils >= (long)this.warningTime) {
            this.logger.warn(sqlId + " 查询结果集费时 超过警告时间：" + offmils + " ms");
        }

        this.logger.debug(sqlId + "<<<<<end>>>>> 查询结果集费时：" + offmils + " ms");
        return resultRows;
    }

    public List<T> findListFromIndex(String sqlId, int startIndex, int pageSize, Object params) {
        this.logger.debug(sqlId + "<<<<<start>>>>>");
        long startmils = System.currentTimeMillis();
        RowBounds rowBounds = new RowBounds(startIndex, pageSize);
        List<T> resultRows = this.getSqlSessionTemplate().selectList(this.getNamespace().concat(sqlId), params, rowBounds);
        this.logger.debug(sqlId + "查询到结果集 list size:" + resultRows.size());
        long startmils3 = System.currentTimeMillis();
        long offmils = startmils3 - startmils;
        if (offmils >= (long)this.warningTime) {
            this.logger.warn(sqlId + " 查询结果集费时 超过警告时间：" + offmils + " ms");
        }

        this.logger.debug(sqlId + "<<<<<end>>>>> 查询结果集费时：" + offmils + " ms");
        return resultRows;
    }

    public T findModelByParams(String sqlId, Object params) {
        Object obj = this.findObjectByParams(sqlId, params);
        return (T) obj;
    }

    public Object findObjectByParams(String sqlId, Object params) {
        this.logger.debug(sqlId + "<<<<<start>>>>>");
        long startmils = System.currentTimeMillis();
        Object obj = this.getSqlSessionTemplate().selectOne(this.getNamespace().concat(sqlId), params);
        this.logger.debug(sqlId + "查询到结果集:" + obj);
        long startmils3 = System.currentTimeMillis();
        long offmils = startmils3 - startmils;
        if (offmils >= (long)this.warningTime) {
            this.logger.warn(sqlId + " 查询结果集费时 超过警告时间：" + offmils + " ms");
        }

        this.logger.debug(sqlId + "<<<<<end>>>>> 查询结果集费时：" + offmils + " ms");
        return obj;
    }

    public List<T> findModelListByParams(String sqlId, Object params) {
        this.logger.debug(sqlId + "<<<<<start>>>>>");
        long startmils = System.currentTimeMillis();
        List<T> list = (List<T>) this.findListByParams(sqlId, params);
        this.logger.debug(sqlId + "查询到结果集 list size:" + list.size());
        long startmils3 = System.currentTimeMillis();
        long offmils = startmils3 - startmils;
        if (offmils >= (long)this.warningTime) {
            this.logger.warn(sqlId + " 查询结果集费时 超过警告时间：" + offmils + " ms");
        }

        this.logger.debug(sqlId + "<<<<<end>>>>> 查询结果集费时：" + offmils + " ms");
        return list;
    }

    public List<?> findListByParams(String sqlId, Object params) {
        this.logger.debug(sqlId + "<<<<<start>>>>>");
        long startmils = System.currentTimeMillis();
        List<?> list = this.getSqlSessionTemplate().selectList(this.getNamespace().concat(sqlId), params);
        this.logger.debug(sqlId + "查询到结果集:" + list.size());
        long startmils3 = System.currentTimeMillis();
        long offmils = startmils3 - startmils;
        if (offmils >= (long)this.warningTime) {
            this.logger.warn(sqlId + "查询结果集费时 超过警告时间：" + offmils + " ms");
        }

        this.logger.debug(sqlId + "<<<<<end>>>>> 查询结果集费时：" + offmils + " ms");
        return list;
    }

    public int delete(String sqlId, Object params) {
        this.logger.debug(sqlId + "<<<<<start>>>>>");
        long startmils = System.currentTimeMillis();
        int result = this.getSqlSessionTemplate().delete(this.getNamespace().concat(sqlId), params);
        this.logger.debug(sqlId + "删除结果:" + result);
        long startmils3 = System.currentTimeMillis();
        long offmils = startmils3 - startmils;
        if (offmils >= (long)this.warningTime) {
            this.logger.warn(sqlId + "删除操作 超过警告时间：" + offmils + " ms");
        }

        this.logger.debug(sqlId + "<<<<<end>>>>> 费时：" + offmils + " ms");
        return result;
    }

    public int update(String sqlId, Object params) {
        this.logger.debug(sqlId + "<<<<<start>>>>>");
        long startmils = System.currentTimeMillis();
        int result = this.getSqlSessionTemplate().update(this.getNamespace().concat(sqlId), params);
        this.logger.debug(sqlId + "更新结果:" + result);
        long startmils3 = System.currentTimeMillis();
        long offmils = startmils3 - startmils;
        if (offmils >= (long)this.warningTime) {
            this.logger.warn(sqlId + " 更新操作 超过警告时间：" + offmils + " ms");
        }

        this.logger.debug(sqlId + "<<<<<end>>>>> 费时：" + offmils + " ms");
        return result;
    }

    public Serializable insert(String sqlId, Object params) {
        this.logger.debug(sqlId + "<<<<<start>>>>>");
        long startmils = System.currentTimeMillis();
        Serializable obj = this.sqlSessionTemplate.insert(this.getNamespace().concat(sqlId), params);
        long startmils3 = System.currentTimeMillis();
        long offmils = startmils3 - startmils;
        if (offmils >= (long)this.warningTime) {
            this.logger.warn(sqlId + " 插入操作 超过警告时间：" + offmils + " ms");
        }

        this.logger.debug(sqlId + "<<<<<end>>>>> 费时：" + (startmils3 - startmils) + " ms");
        return obj;
    }
}

