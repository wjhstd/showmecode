package cn.a52going.coderpc.dto;

import cn.a52going.coderpc.plugin.page.Pager;

import java.util.List;

public class DataTableOutput {
    private List<?> aaData;
    private Integer iTotalRecords;
    private Integer iTotalDisplayRecords;
    private Integer iDisplayStart = Integer.valueOf(0);
    private Integer iDisplayLength = Integer.valueOf(0);

    public DataTableOutput() {
    }

    public DataTableOutput(Pager<?> pager) {
        this.aaData = pager.getResultList();
        this.iTotalRecords = pager.getTotalCount();
        this.iTotalDisplayRecords = pager.getTotalCount();
        this.iDisplayStart = (pager.getCurPage() - 1) * pager.getPageSize();
        this.iDisplayLength = pager.getResultList().size();
    }

    public List<?> getAaData() {
        return this.aaData;
    }

    public void setAaData(List<?> aaData) {
        this.aaData = aaData;
    }

    public Integer getiTotalRecords() {
        return this.iTotalRecords;
    }

    public void setiTotalRecords(Integer iTotalRecords) {
        this.iTotalRecords = iTotalRecords;
    }

    public Integer getiTotalDisplayRecords() {
        return this.iTotalDisplayRecords;
    }

    public void setiTotalDisplayRecords(Integer iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }

    public Integer getiDisplayStart() {
        return this.iDisplayStart;
    }

    public Integer getiDisplayLength() {
        return this.iDisplayLength;
    }
}
