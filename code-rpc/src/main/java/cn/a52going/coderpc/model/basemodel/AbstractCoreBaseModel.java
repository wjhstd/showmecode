package cn.a52going.coderpc.model.basemodel;

import java.io.Serializable;

public abstract class AbstractCoreBaseModel<ID extends Serializable>  extends BaseSimpleModel<ID> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;



    //所有父公司的连接，用于数据权限区分
    private String orgLinks ;

    public String getOrgLinks() {
        return orgLinks;
    }
    public void setOrgLinks(String orgLinks) {
        this.orgLinks = orgLinks;
    }






}
