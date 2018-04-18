package cn.a52going.coderpc.dto;

public class DataTableInput {
    private Integer iDisplayStart;
    private Integer iDisplayLength;
    private Integer isortCol;
    private String sortDir;
    private String sortProp;

    public DataTableInput() {
    }

    public Integer getiDisplayStart() {
        return this.iDisplayStart;
    }

    public void setiDisplayStart(Integer iDisplayStart) {
        this.iDisplayStart = iDisplayStart;
    }

    public Integer getiDisplayLength() {
        return this.iDisplayLength;
    }

    public void setiDisplayLength(Integer iDisplayLength) {
        this.iDisplayLength = iDisplayLength;
    }
}
