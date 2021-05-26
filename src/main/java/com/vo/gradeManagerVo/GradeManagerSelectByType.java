package com.vo.gradeManagerVo;

public class GradeManagerSelectByType {

    private Integer page;
    private Integer items;
    private String year;
    private String courseName;
    private String className;
    private String studentId;

    private String teacherId;

    public GradeManagerSelectByType() {
    }

    @Override
    public String toString() {
        return "GradeManagerSelectByType{" +
                "page=" + page +
                ", items=" + items +
                ", year='" + year + '\'' +
                ", courseName='" + courseName + '\'' +
                ", className='" + className + '\'' +
                ", studentId='" + studentId + '\'' +
                ", teacherId='" + teacherId + '\'' +
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public GradeManagerSelectByType(Integer page, Integer items, String year, String courseName, String className, String studentId, String teacherId) {
        this.page = page;
        this.items = items;
        this.year = year;
        this.courseName = courseName;
        this.className = className;
        this.studentId = studentId;
        this.teacherId = teacherId;
    }
}
