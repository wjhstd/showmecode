package cn.a52going.coderpc.service.baseservice;

import cn.a52going.coderpc.dto.input.CmsBaseInput;
import cn.a52going.coderpc.dto.query.CmsBaseQuery;
import cn.a52going.coderpc.plugin.dto.ResultDto;
import cn.a52going.coderpc.plugin.exception.BusinessException;

import java.io.Serializable;
import java.util.List;

public abstract class CmsBaseServiceImpl<Query extends CmsBaseQuery, Input extends CmsBaseInput> implements CmsBaseService<Query, Input> {
    public CmsBaseServiceImpl() {
    }

    public ResultDto<?> save(Input t) throws BusinessException {
        ResultDto<Integer> resultDto = new ResultDto();
        resultDto.setErrorCode(Integer.valueOf(1109));
        resultDto.setErrorMsg("暂时不支持保存");
        return resultDto;
    }

    public ResultDto<?> update(Serializable id, Input t) throws BusinessException {
        ResultDto<Integer> resultDto = new ResultDto();
        resultDto.setErrorCode(Integer.valueOf(1109));
        resultDto.setErrorMsg("暂时不支持更新");
        return resultDto;
    }

    public ResultDto<?> remove(Serializable id) throws BusinessException {
        ResultDto<Integer> resultDto = new ResultDto();
        resultDto.setErrorCode(Integer.valueOf(1109));
        resultDto.setErrorMsg("暂时不支持删除");
        return resultDto;
    }

    public ResultDto<?> removeMore(List<? extends Serializable> ids) throws BusinessException {
        ResultDto<Integer> resultDto = new ResultDto();
        resultDto.setErrorCode(Integer.valueOf(1109));
        resultDto.setErrorMsg("暂时不支持删除多个");
        return resultDto;
    }
}
