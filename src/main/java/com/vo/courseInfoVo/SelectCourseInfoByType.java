package com.vo.courseInfoVo;

import java.util.Objects;

public class SelectCourseInfoByType {

    private Integer page;
    private Integer items;
    private String courseName;
    private String type;
    private String deptName;

    public SelectCourseInfoByType(Integer page, Integer items, String courseName, String type, String deptName) {
        this.page = page;
        this.items = items;
        this.courseName = courseName;
        this.type = type;
        this.deptName = deptName;
    }

    public SelectCourseInfoByType() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SelectCourseInfoByType that = (SelectCourseInfoByType) o;
        return Objects.equals(page, that.page) &&
                Objects.equals(items, that.items) &&
                Objects.equals(courseName, that.courseName) &&
                Objects.equals(type, that.type) &&
                Objects.equals(deptName, that.deptName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, items, courseName, type, deptName);
    }

    @Override
    public String toString() {
        return "SelectCourseInfoByType{" +
                "page=" + page +
                ", items=" + items +
                ", courseName='" + courseName + '\'' +
                ", type='" + type + '\'' +
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
