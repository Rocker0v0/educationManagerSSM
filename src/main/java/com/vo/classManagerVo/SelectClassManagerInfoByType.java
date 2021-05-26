package com.vo.classManagerVo;

import java.util.Objects;

public class SelectClassManagerInfoByType {

    private Integer page;
    private Integer items;
    private String year;
    private String majorName;
    private String deptName;

    public SelectClassManagerInfoByType(Integer page, Integer items, String year, String majorName, String deptName) {
        this.page = page;
        this.items = items;
        this.year = year;
        this.majorName = majorName;
        this.deptName = deptName;
    }

    public SelectClassManagerInfoByType() {
    }

    @Override
    public String toString() {
        return "SelectClassManagerInfoByType{" +
                "page=" + page +
                ", items=" + items +
                ", year='" + year + '\'' +
                ", majorName='" + majorName + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SelectClassManagerInfoByType that = (SelectClassManagerInfoByType) o;
        return Objects.equals(page, that.page) &&
                Objects.equals(items, that.items) &&
                Objects.equals(year, that.year) &&
                Objects.equals(majorName, that.majorName) &&
                Objects.equals(deptName, that.deptName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, items, year, majorName, deptName);
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}