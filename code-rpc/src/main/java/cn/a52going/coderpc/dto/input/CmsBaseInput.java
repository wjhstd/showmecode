package cn.a52going.coderpc.dto.input;

import cn.a52going.coderpc.dto.input.baseinput.CmsInput;

/**
 *@ClassName: CmsBaseInput
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/13 14:39
 **/
public class CmsBaseInput implements CmsInput {
    protected String orgLinks;

    public CmsBaseInput() {
    }

    public String getOrgLinks() {
        return this.orgLinks;
    }

    public void setOrgLinks(String orgLinks) {
        this.orgLinks = orgLinks;
    }
}

