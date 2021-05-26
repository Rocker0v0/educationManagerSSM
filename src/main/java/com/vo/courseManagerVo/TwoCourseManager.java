package com.vo.courseManagerVo;

public class TwoCourseManager {

    private CourseManager newCourseManager;
    private CourseManager oldCourseManager;

    public TwoCourseManager(CourseManager newCourseManager, CourseManager oldCourseManager) {
        this.newCourseManager = newCourseManager;
        this.oldCourseManager = oldCourseManager;
    }

    public TwoCourseManager() {
    }

    public CourseManager getNewCourseManager() {
        return newCourseManager;
    }

    public void setNewCourseManager(CourseManager newCourseManager) {
        this.newCourseManager = newCourseManager;
    }

    public CourseManager getOldCourseManager() {
        return oldCourseManager;
    }

    public void setOldCourseManager(CourseManager oldCourseManager) {
        this.oldCourseManager = oldCourseManager;
    }
}
