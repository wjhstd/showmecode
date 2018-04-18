package cn.a52going.coderpc.model.basemodel;

import java.io.Serializable;

public interface BaseModel<ID extends Serializable> {
    ID getId();

    String getOrderStr();
}