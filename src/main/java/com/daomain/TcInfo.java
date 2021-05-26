package com.daomain;

public class TcInfo {
    private String teacherID;
    private String courseID;
    private Integer semester;
    private Integer startWeek;
    private Integer endWeek;
    private Integer day;
    private String classRoomId;
    private Integer classOne;
    private Integer classTwo;
    private Integer maxStudents;
    private Integer id;

    public TcInfo(String teacherID, String courseID, Integer semester, Integer startWeek, Integer endWeek, Integer day, String classRoomId, Integer classOne, Integer classTwo, Integer maxStudents, Integer id) {
        this.teacherID = teacherID;
        this.courseID = courseID;
        this.semester = semester;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
        this.day = day;
        this.classRoomId = classRoomId;
        this.classOne = classOne;
        this.classTwo = classTwo;
        this.maxStudents = maxStudents;
        this.id = id;
    }

    public TcInfo() {
    }

    @Override
    public String toString() {
        return "TcInfo{" +
                "teacherID='" + teacherID + '\'' +
                ", courseID='" + courseID + '\'' +
                ", semester=" + semester +
                ", startWeek=" + startWeek +
                ", endWeek=" + endWeek +
                ", day=" + day +
                ", classRoomId='" + classRoomId + '\'' +
                ", classOne=" + classOne +
                ", classTwo=" + classTwo +
                ", maxStudents=" + maxStudents +
                ", id=" + id +
                '}';
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
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

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(String classRoomId) {
        this.classRoomId = classRoomId;
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

    public Integer getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(Integer maxStudents) {
        this.maxStudents = maxStudents;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
