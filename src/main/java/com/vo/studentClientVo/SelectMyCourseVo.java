package com.vo.studentClientVo;

public class SelectMyCourseVo {
    private Integer page;
    private Integer items;
    private String courseName;
    private String teacherName;
    private String studentId;

    public SelectMyCourseVo(Integer page, Integer items, String courseName, String teacherName, String studentId) {
        this.page = page;
        this.items = items;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.studentId = studentId;
    }

    public SelectMyCourseVo() {
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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
