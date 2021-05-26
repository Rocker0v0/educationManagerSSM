package com.vo.teacherClientVo;

public class TeacherClientVo {

    private String courseName;
    private String teacherName;
    private Integer semester;
    private Integer startWeek;
    private Integer endWeek;
    private Integer day;
    private Integer classOne;
    private Integer classTwo;
    private String classRoomName;

    public TeacherClientVo(String courseName, String teacherName, Integer semester, Integer startWeek, Integer endWeek, Integer day, Integer classOne, Integer classTwo, String classRoomName) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.semester = semester;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
        this.day = day;
        this.classOne = classOne;
        this.classTwo = classTwo;
        this.classRoomName = classRoomName;
    }

    public TeacherClientVo() {
    }

    @Override
    public String toString() {
        return "TeacherClientVo{" +
                "courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", semester=" + semester +
                ", startWeek=" + startWeek +
                ", endWeek=" + endWeek +
                ", day=" + day +
                ", classOne=" + classOne +
                ", classTwo=" + classTwo +
                ", classRoomName='" + classRoomName + '\'' +
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

    public String getClassRoomName() {
        return classRoomName;
    }

    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }
}
