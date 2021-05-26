package com.vo.gradeManagerVo;

public class GradeManagerAllInfo {

    private Integer year;
    private String studentId;
    private String studentName;
    private String type;
    private String courseName;
    private String teacherName;
    private Integer grade;
    private String className;
    private Integer primaryId;

    public GradeManagerAllInfo() {
    }

    public GradeManagerAllInfo(Integer year, String studentId, String studentName, String type, String courseName, String teacherName, Integer grade, String className, Integer primaryId) {
        this.year = year;
        this.studentId = studentId;
        this.studentName = studentName;
        this.type = type;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.grade = grade;
        this.className = className;
        this.primaryId = primaryId;
    }

    @Override
    public String toString() {
        return "GradeManagerAllInfo{" +
                "year=" + year +
                ", studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", type='" + type + '\'' +
                ", courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", grade=" + grade +
                ", className='" + className + '\'' +
                ", primaryId=" + primaryId +
                '}';
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(Integer primaryId) {
        this.primaryId = primaryId;
    }
}
