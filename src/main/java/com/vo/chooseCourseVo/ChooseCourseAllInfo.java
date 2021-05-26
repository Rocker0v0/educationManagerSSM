package com.vo.chooseCourseVo;

public class ChooseCourseAllInfo {

    private String className;
    private String courseName;
    private String teacherName;
    private String deptName;
    private String majorName;
    private Integer startWeek;
    private Integer endWeek;
    private Integer year;
    private Integer day;
    private Integer classOne;
    private Integer classTwo;
    private Integer id;

    public ChooseCourseAllInfo() {
    }

    public ChooseCourseAllInfo(String className, String courseName, String teacherName, String deptName, String majorName, Integer startWeek, Integer endWeek, Integer year, Integer day, Integer classOne, Integer classTwo, Integer id) {
        this.className = className;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.deptName = deptName;
        this.majorName = majorName;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
        this.year = year;
        this.day = day;
        this.classOne = classOne;
        this.classTwo = classTwo;
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Integer getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(Integer startWeek) {
        this.startWeek = startWeek;
    }

    public Integer getEndWeek() {
        return endWeek;
    }

    public void setEndWeek(Integer endWeek) {
        this.endWeek = endWeek;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getClassOne() {
        return classOne;
    }

    public void setClassOne(Integer classOne) {
        this.classOne = classOne;
    }

    public Integer getClassTwo() {
        return classTwo;
    }

    public void setClassTwo(Integer classTwo) {
        this.classTwo = classTwo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
