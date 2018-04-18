package cn.a52going.coderpc.commonService;

import cn.a52going.coderpc.commonDto.resp.ResultDTO;
import cn.a52going.coderpc.plugin.exception.BusinessException;
import cn.a52going.coderpc.plugin.page.Pager;

import java.io.Serializable;
import java.util.List;

public interface BaseCommonService<T,QueryParam>  {




    /**
     * 通过ID查找
     * @Title: getById
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param id
     * @param @return    设定文件
     * @return T    返回类型
     * @throws
     */
    T findById(Serializable id);


    /**
     * @Title: save
     * @Description: 保存或修改Inves对象
     * @param  T
     * @return ResultDTO   如果成功会返回ID号
     */
    public ResultDTO<Serializable> save(T t);




    /**
     * @Title: update
     * @Description: 更新
     * @param  更新数据，需要有id
     * @return ResultDTO<Integer>    返回类型<条数>
     */
    public ResultDTO<Integer> update(T t);


    /**
     *
     * @Title: queryPager
     * @Description: 分页查询评估申请调查信息
     * @param  pageSize
     * @param  pageNo
     * @param  param 查询参数
     * @return Pager<T>
     */
    public Pager<T> queryPager(int pageSize, int pageNo, QueryParam param);


    /**
     *
     * @Title: queryPager
     * @Description: 分页查询评估申请调查信息
     * @param  pageSize
     * @param  pageNo
     * @param  q 查询参数
     * @return List<T>
     */
    public List<T> queryList(int pageSize, int pageNo, QueryParam param);




    /**
     * @Title: remove
     * @Description: 通过id删除一个对象
     * @param  id
     * @return  设定文件
     * @return ResultDTO<Integer>   返回类型  并返回删除个数
     */
    public ResultDTO<Integer>  delete(Serializable id) ;




    /**
     * @Title: queryPager
     * @Description: 查询所有
     * @return List<T>
     */
    public List<T> loadAll();



    /**
     *
     * @Title: queryList
     * @Description: 查询列表
     * @param  param
     * @return   设定文件
     * @return List<T>    返回类型
     * @throws
     */
    public List<T> queryList(QueryParam param);




    /**
     *
     * @Title: exists
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param  param
     * @param     设定文件
     * @return boolean    返回类型
     * @throws
     */
    public boolean exists(QueryParam param);




    /**
     * @Title: findTop
     * @Description: 查询最上边一条
     * @param  param
     * @return T    返回类型
     * @throws
     */
    public T findTopOne(QueryParam param);




    /**
     * @Title: findTop
     * @Description: 查询最上边一条
     * @param  param
     * @param  orderStr  排序串
     * @size 	返回最大的大小
     * @return T    返回类型
     * @throws
     */
    public List<T> findTopList(QueryParam param,int maxSize);



    /**
     * 通过ID删除多个，循环列表一个个删除,删除失败以后将抛出BusinessException，业务将回滚
     * @Title: deleteByIds
     * @param  ids id列表
     * @return ResultDTO<Integer> <删除个数>    返回类型
     * @throws BusinessException
     */
    public ResultDTO<Integer> deleteByIds(List<Serializable> ids) throws BusinessException;







}
