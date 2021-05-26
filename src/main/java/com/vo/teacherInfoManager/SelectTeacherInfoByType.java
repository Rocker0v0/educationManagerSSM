package com.vo.teacherInfoManager;

public class SelectTeacherInfoByType {
    private Integer page;
    private Integer items;
    private String teacherId;
    private String deptName;
    private String teacherName;

    public SelectTeacherInfoByType(Integer page, Integer items, String teacherId, String deptName, String teacherName) {
        this.page = page;
        this.items = items;
        this.teacherId = teacherId;
        this.deptName = deptName;
        this.teacherName = teacherName;
    }

    public SelectTeacherInfoByType() {
    }

    @Override
    public String toString() {
        return "SelectTeacherInfoByType{" +
                "page=" + page +
                ", items=" + items +
                ", teacherId='" + teacherId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", teacherName='" + teacherName + '\'' +
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

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
