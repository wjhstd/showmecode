package cn.a52going.coderpc.dao.basedao;

import cn.a52going.coderpc.model.basemodel.AbstractCoreBaseModel;
import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;
import java.io.Serializable;

public class LtcInsCoreBaseDAO<T extends AbstractCoreBaseModel<ID>,ID extends Serializable> extends BaseSimpleDao<T,ID > {



    @Resource(name="ltcinsCore-sqlSessionTemplate")
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate){
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

}