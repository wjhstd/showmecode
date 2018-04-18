package cn.a52going.coderpc.service.baseservice;

import cn.a52going.coderpc.dto.input.CmsBaseInput;
import cn.a52going.coderpc.dto.query.CmsBaseQuery;
import cn.a52going.coderpc.plugin.dto.ResultDto;
import cn.a52going.coderpc.plugin.exception.BusinessException;
import cn.a52going.coderpc.plugin.page.Pager;

import java.io.Serializable;
import java.util.List;

public interface CmsBaseService<Query extends CmsBaseQuery, Input extends CmsBaseInput> {
    Pager<?> query(int var1, int var2, Query var3);

    ResultDto<?> save(Input var1) throws BusinessException;

    Input loadForEdit(Serializable var1);

    ResultDto<?> update(Serializable var1, Input var2) throws BusinessException;

    ResultDto<?> remove(Serializable var1) throws BusinessException;

    ResultDto<?> removeMore(List<? extends Serializable> var1) throws BusinessException;
}
