package com.vo.studentInfoManager;

import java.util.Objects;

public class StudentInfoMangerVo {
    private String studentId;
    private String studentName;
    private String studentSex;
    private String studentBirth;
    private String nationality;
    private String deptName;
    private String className;
    private String majorName;
    private String year;

    public StudentInfoMangerVo() {
    }

    public StudentInfoMangerVo(String studentId, String studentName, String studentSex, String studentBirth, String nationality, String deptName, String className, String majorName, String year) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentBirth = studentBirth;
        this.nationality = nationality;
        this.deptName = deptName;
        this.className = className;
        this.majorName = majorName;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentInfoMangerVo that = (StudentInfoMangerVo) o;
        return Objects.equals(studentId, that.studentId) &&
                Objects.equals(studentName, that.studentName) &&
                Objects.equals(studentSex, that.studentSex) &&
                Objects.equals(studentBirth, that.studentBirth) &&
                Objects.equals(nationality, that.nationality) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(className, that.className) &&
                Objects.equals(majorName, that.majorName) &&
                Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentSex, studentBirth, nationality, deptName, className, majorName, year);
    }

    @Override
    public String toString() {
        return "StudentInfoMangerVo{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentSex='" + studentSex + '\'' +
                ", studentBirth='" + studentBirth + '\'' +
                ", nationality='" + nationality + '\'' +
                ", deptName='" + deptName + '\'' +
                ", className='" + className + '\'' +
                ", majorName='" + majorName + '\'' +
                ", year='" + year + '\'' +
                '}';
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

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentBirth() {
        return studentBirth;
    }

    public void setStudentBirth(String studentBirth) {
        this.studentBirth = studentBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
