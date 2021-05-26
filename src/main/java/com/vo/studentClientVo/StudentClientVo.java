package com.vo.studentClientVo;

public class StudentClientVo {
   private String courseName;
    private String teacherName;
    private String type;
    private String credits;
    private String grade;

    public StudentClientVo(String courseName, String teacherName, String type, String credits, String grade) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.type = type;
        this.credits = credits;
        this.grade = grade;
    }

    public StudentClientVo() {
    }

    @Override
    public String toString() {
        return "StudentClientVo{" +
                "courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", type='" + type + '\'' +
                ", credits='" + credits + '\'' +
                ", grade='" + grade + '\'' +
                '}';
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
