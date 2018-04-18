package cn.a52going.coderpc.commonService;

import cn.a52going.coderpc.commonDto.resp.ResultDTO;
import cn.a52going.coderpc.dao.basedao.LtcInsCoreBaseDAO;
import cn.a52going.coderpc.model.basemodel.BaseModel;
import cn.a52going.coderpc.plugin.exception.BusinessException;
import cn.a52going.coderpc.plugin.page.Pager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.Serializable;
import java.util.List;
/**
 *@ClassName: BaseCommonServiceImpl
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/13 14:58
 **/
public abstract class BaseCommonServiceImpl<DAO extends LtcInsCoreBaseDAO,T,QueryParam> implements BaseCommonService<T,QueryParam> {

    private Log log = LogFactory.getLog(this.getClass());

    protected DAO dao;

    protected abstract void setDao(DAO dao);


    @Override
    public T findById(Serializable id) {

        return (T) dao.findById(id);
    }


    @Override
    public ResultDTO<Serializable> save(T t) {
        ResultDTO<Serializable> resultDTO = new ResultDTO<>();
        Serializable id = dao.create((BaseModel) t);
        resultDTO.setReturnObj(id);
        return (ResultDTO<Serializable>) resultDTO;
    }

    @Override
    public ResultDTO<Integer> update(T t) {
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        int count = dao.update((BaseModel) t);
        resultDTO.setReturnObj(count);
        return resultDTO;
    }


    @Override
    public Pager<T> queryPager(int pageSize, int pageNo, QueryParam q) {
        return dao.findPageBySelective(pageSize, pageNo, q);
    }

    @Override
    public List<T> queryList(QueryParam q) {
        return dao.findListBySelective(q);
    }


    @Override
    public ResultDTO<Integer> delete(Serializable id) {
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        int delCount = dao.deleteById(id);
        resultDTO.setReturnObj(delCount);
        return resultDTO;

    }


    @Override
    public List<T> queryList(int pageSize, int pageNo, QueryParam param) {
        return dao.findListBySelective(pageSize, pageNo, param);
    }


    @Override
    public List<T> loadAll() {
        return dao.loadAll();
    }


    @Override
    public boolean exists(QueryParam param) {
        return dao.existsBySelective(param);
    }


    @Override
    public T findTopOne(QueryParam param) {
        return (T) dao.findTopBySelective(param);
    }


    @Override
    public List<T> findTopList(QueryParam param, int maxSize) {
        return dao.findTopListBySelective(param, maxSize);
    }


    @Override
    public ResultDTO<Integer> deleteByIds(List<Serializable> ids) throws BusinessException {
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            int deleteCount = dao.deleteByIds(ids);
            resultDTO.setReturnObj(deleteCount);
            return resultDTO;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new BusinessException(1109, "删除多个过程中失败，数据将回滚", e);
        }
    }
}


