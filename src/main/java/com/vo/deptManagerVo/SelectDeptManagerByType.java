package com.vo.deptManagerVo;

public class SelectDeptManagerByType {

    private Integer page;
    private Integer items;
    private String deptId;
    private String parentDeptName;
    private String deptName;

    public SelectDeptManagerByType() {
    }

    public SelectDeptManagerByType(Integer page, Integer items, String deptId, String parentDeptName, String deptName) {
        this.page = page;
        this.items = items;
        this.deptId = deptId;
        this.parentDeptName = parentDeptName;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "SelectDeptManagerByType{" +
                "page=" + page +
                ", items=" + items +
                ", deptId='" + deptId + '\'' +
                ", parentDeptName='" + parentDeptName + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getParentDeptName() {
        return parentDeptName;
    }

    public void setParentDeptName(String parentDeptName) {
        this.parentDeptName = parentDeptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
