package cn.a52going.coderpc.dto.query;

import cn.a52going.coderpc.dto.query.basequery.CmsQuery;
/**
 *@ClassName: CmsBaseQuery
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/13 14:53
 **/


public class CmsBaseQuery implements CmsQuery {
    protected String orderStr;
    protected String keyword;
    protected String orgLinks;

    public CmsBaseQuery() {
    }

    public String getOrderStr() {
        return this.orderStr;
    }

    public void setOrderStr(String orderStr) {
        this.orderStr = orderStr;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getOrgLinks() {
        return this.orgLinks;
    }

    public void setOrgLinks(String orgLinks) {
        this.orgLinks = orgLinks;
    }
}

