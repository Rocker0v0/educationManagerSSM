package com.vo.studentClientVo;

public class SelectStudentClientGrade {
    private Integer page;
    private Integer items;
    private String courseName;
    private String teacherName;
    private String semester;
    private String studentId;

    public SelectStudentClientGrade(Integer page, Integer items, String courseName, String teacherName, String semester, String studentId) {
        this.page = page;
        this.items = items;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.semester = semester;
        this.studentId = studentId;
    }

    public SelectStudentClientGrade() {
    }

    @Override
    public String toString() {
        return "SelectStudentClientGrade{" +
                "page=" + page +
                ", items=" + items +
                ", courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", semester='" + semester + '\'' +
                ", studentId='" + studentId + '\'' +
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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
