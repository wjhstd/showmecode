package cn.a52going.coderpc.dao.basedao;

import cn.a52going.coderpc.model.basemodel.BaseModel;
import cn.a52going.coderpc.plugin.page.Pager;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

public class BaseSimpleDao<T extends BaseModel<IDTYPE>, IDTYPE extends Serializable> extends BaseDao<T> {
    public static final String CREATE = "create";
    public static final String CREATE_BATCH = "create_BATCH";
    public static final String UPDATE = "update";
    public static final String UPDATE_BATCH = "update_BATCH";
    public static final String DELETE_BY_ID = "deleteById";
    public static final String DELETE_BY_ID_BATCH = "deleteById_BATCH";
    public static final String FIND_BY_ID = "findById";
    public static final String LOAD_ALL = "loadAll";
    public static final String FIND_BY_SELECTIVE = "findBySelective";
    public static final String FIND_BY_SELECTIVE_COUNT = "findBySelective_COUNT";
    public static final String EXISTS_BY_SELECTIVE = "existsBySelective";
    protected int defaultMaxPageSize = 1000;

    public int getDefaultMaxPageSize() {
        return this.defaultMaxPageSize;
    }

    public void setDefaultMaxPageSize(int defaultMaxPageSize) {
        this.defaultMaxPageSize = defaultMaxPageSize;
    }

    public BaseSimpleDao() {
        Type genType = this.getClass().getGenericSuperclass();
        if (genType != null) {
            Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
            if (params.length == 0) {
                this.logger.error("loading " + this.namespace + " Dao ..... error 泛型类必须定义，< T > T 必须定义");
                throw new IllegalArgumentException("泛型类必须定义，< T > T 必须定义");
            }

            Class<T> modelClass = (Class)params[0];
            String namespace = modelClass.getName();
            this.setNamespace(namespace);
            this.logger.debug("loading " + namespace + " Dao ..... ");
        }

        if (this.namespace == null) {
            this.logger.warn(this.getClass() + "未设置namesapce");
        }

    }

    public IDTYPE create(T t) {
        int i = ((Integer)super.insert("create", t)).intValue();
        return i == 1 ? t.getId() : null;
    }

    public int deleteById(IDTYPE id) {
        return super.delete("deleteById", id);
    }

    public int deleteByIds(List<IDTYPE> ids) {
        int i = 0;

        Serializable id;
        for(Iterator var3 = ids.iterator(); var3.hasNext(); i += this.deleteById((IDTYPE) id)) {
            id = (Serializable)var3.next();
        }

        return i;
    }

    public int update(T t) {
        return this.update("update", t);
    }

    public int batchCreate(List<T> list) {
        return ((Integer)this.insert("create_BATCH", list)).intValue();
    }

    public int batchUpdate(List<T> list) {
        return ((Integer)this.update("update_BATCH", list)).intValue();
    }

    public int batchDelete(List<IDTYPE> ids) {
        return super.delete("deleteById_BATCH", ids);
    }

    public List<T> loadAll() {
        return (List<T>) this.findListByParams("loadAll", (Object)null);
    }

    public T findById(IDTYPE id) {
        return (T) this.findObjectByParams("findById", id);
    }

    public Pager<T> findPageBySelective(int pageSize, int pageNo, Object params) {
        return this.findByPage("findBySelective", "findBySelective_COUNT", pageSize, pageNo, params);
    }

    public int findCountBySelective(T params) {
        Integer count = (Integer)this.findObjectByParams("findBySelective_COUNT", params);
        return count.intValue();
    }

    public List<T> findListBySelective(int pageSize, int pageNo, Object params) {
        List<T> resultRows = this.findList("findBySelective", pageSize, pageNo, params);
        return resultRows;
    }

    public List<T> findListBySelectiveFromIndex(int startIndex, int pageSize, Object params) {
        List<T> resultRows = this.findListFromIndex("findBySelective", startIndex, pageSize, params);
        return resultRows;
    }

    public List<T> findListBySelective(Object params) {
        List<T> resultRows = this.findList("findBySelective", this.defaultMaxPageSize, 1, params);
        return resultRows;
    }

    public List<T> findTopListBySelective(Object params, int size) {
        List<T> resultRows = this.findList("findBySelective", size, 1, params);
        return resultRows;
    }

    public T findTopBySelective(Object params) {
        List<T> resultRows = this.findList("findBySelective", 1, 1, params);
        return resultRows.isEmpty() ? null : (T) (BaseModel) resultRows.get(0);
    }

    public boolean existsBySelective(Object params) {
        Integer val = (Integer)this.findObjectByParams("existsBySelective", params);
        return val != null && val.intValue() == 1;
    }

    public T findUniqueBySelective(Object params) {
        List<T> resultRows = this.findList("findBySelective", 2, 1, params);
        if (resultRows.size() > 1) {
            throw new RuntimeException("数据并不唯一，原参数：" + params);
        } else {
            return resultRows.size() == 1 ? (T) (BaseModel) resultRows.get(0) : null;
        }
    }
}
