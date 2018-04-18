package cn.a52going.coderpc.plugin.page;

import java.io.Serializable;
import java.util.List;
/**
 *@ClassName: Pager
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/13 14:53
 **/


public class Pager<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    protected int curPage;
    protected int pageSize;
    private int totalCount;
    private List<T> resultList;

    public Pager(int curPage, int pageSize) {
        this.curPage = 1;
        this.pageSize = 15;
        this.totalCount = 0;
        this.setCurPage(curPage);
        this.setPageSize(pageSize);
    }

    public Pager(int curPage, int pageSize, int totalCount, List<T> resultList) {
        this(curPage, pageSize);
        this.totalCount = totalCount;
        this.resultList = resultList;
    }

    public int getCurPage() {
        return this.curPage;
    }

    public void setCurPage(int curPage) {
        if (curPage < 0) {
            curPage = 1;
        }

        this.curPage = curPage;
    }

    public int getPageSize() {
        if (this.pageSize < 0) {
            this.pageSize = 1;
        }

        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(int totalCount) {
        if (totalCount < 0) {
            totalCount = 0;
        }

        this.totalCount = totalCount;
    }

    public List<T> getResultList() {
        return this.resultList;
    }

    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }

    public int getPageCount() {
        int pageCount = this.totalCount / this.pageSize + (this.totalCount % this.pageSize == 0 ? 0 : 1);
        return pageCount;
    }

    public int getBeginIndex() {
        return this.pageSize * (this.curPage - 1) + 1;
    }

    public int getEndIndex() {
        int maxIndex = this.pageSize * this.curPage;
        return maxIndex > this.totalCount ? this.totalCount : maxIndex;
    }

    public String toString() {
        return String.format("{curPage:%d,pageSize:%d,totalCount:%d,resultList:%s,startIndex:%d,endIndex:%d}", this.curPage, this.pageSize, this.totalCount, this.resultList, this.getBeginIndex(), this.getEndIndex());
    }
}
