package cn.a52going.coderpc.model.basemodel;

import java.io.Serializable;

public class BaseSimpleModel<ID extends Serializable> implements BaseModel<ID> {
    protected ID id;
    protected String orderStr;

    public BaseSimpleModel() {
    }

    public ID getId() {
        return this.id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public String getOrderStr() {
        return this.orderStr;
    }

    public void setOrderStr(String orderStr) {
        this.orderStr = orderStr;
    }
}
