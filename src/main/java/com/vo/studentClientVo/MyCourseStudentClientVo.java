package com.vo.studentClientVo;

public class MyCourseStudentClientVo {

    private String courseName;
    private String  teacherName;
    private String startWeek;
    private String endWeek;
    private String day;
    private String classOne;
    private String  classTwo;
    private String classRoomName;
    private String  id;
    private String studentId;
    private String semester;
    private String primaryId;
    private String type;

    public MyCourseStudentClientVo(String courseName, String teacherName, String startWeek, String endWeek, String day, String classOne, String classTwo, String classRoomName, String id, String studentId, String semester, String primaryId, String type) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
        this.day = day;
        this.classOne = classOne;
        this.classTwo = classTwo;
        this.classRoomName = classRoomName;
        this.id = id;
        this.studentId = studentId;
        this.semester = semester;
        this.primaryId = primaryId;
        this.type = type;
    }

    public MyCourseStudentClientVo() {
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

    public String getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(String startWeek) {
        this.startWeek = startWeek;
    }

    public String getEndWeek() {
        return endWeek;
    }

    public void setEndWeek(String endWeek) {
        this.endWeek = endWeek;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getClassOne() {
        return classOne;
    }

    public void setClassOne(String classOne) {
        this.classOne = classOne;
    }

    public String getClassTwo() {
        return classTwo;
    }

    public void setClassTwo(String classTwo) {
        this.classTwo = classTwo;
    }

    public String getClassRoomName() {
        return classRoomName;
    }

    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(String primaryId) {
        this.primaryId = primaryId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
