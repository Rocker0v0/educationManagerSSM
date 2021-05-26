package com.vo.courseManagerVo;


public class CourseManager {

    private String courseName;
    private String deptName;
    private String teacherName;
    private Integer semester;
    private Integer startWeek;
    private Integer endWeek;
    private Integer day;
    private Integer classOne;
    private Integer classTwo;
    private String classRoomName;
    private Integer maxStudents;
    private String type;
    private Integer id;
    private Integer isNewAdd;
    
    public CourseManager(String courseName, String deptName, String teacherName, Integer semester, Integer startWeek, Integer endWeek, Integer day, Integer classOne, Integer classTwo, String classRoomName, Integer maxStudents, String type, Integer id, Integer isNewAdd) {
        this.courseName = courseName;
        this.deptName = deptName;
        this.teacherName = teacherName;
        this.semester = semester;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
        this.day = day;
        this.classOne = classOne;
        this.classTwo = classTwo;
        this.classRoomName = classRoomName;
        this.maxStudents = maxStudents;
        this.type = type;
        this.id = id;
        this.isNewAdd = isNewAdd;
    }

    public CourseManager() {
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "CourseManager{" +
                "courseName='" + courseName + '\'' +
                ", deptName='" + deptName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", semester=" + semester +
                ", startWeek=" + startWeek +
                ", endWeek=" + endWeek +
                ", day=" + day +
                ", classOne=" + classOne +
                ", classTwo=" + classTwo +
                ", classRoomName='" + classRoomName + '\'' +
                ", maxStudents=" + maxStudents +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", isNewAdd=" + isNewAdd +
                '}';
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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

    public Integer getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(Integer maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIsNewAdd() {
        return isNewAdd;
    }

    public void setIsNewAdd(Integer isNewAdd) {
        this.isNewAdd = isNewAdd;
    }
}
