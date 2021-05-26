package com.dao;

import com.daomain.TcInfo;
import com.vo.courseManagerVo.CourseManager;
import com.vo.courseManagerVo.PartTcInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseManagerDao {

    List<CourseManager> getCourseManager(
            @Param(value = "type") String type,
            @Param(value = "TNAME") String TNAME,
            @Param(value = "CNAME") String CNAME
    );

    List<String> getAbleCourses();

    List<String> getAbleTeachers(@Param(value = "CNAME")String cName,@Param(value = "semester") Integer semester);

    List<TcInfo> getAllReadyTc(@Param(value="TNAME")String tName,
                               @Param(value="SEMESTER")Integer semester,
                               @Param(value="start_week")Integer startWeek,
                                @Param(value="end_week")Integer endWeek,
                               @Param(value="type")String  type,
                               @Param(value="CNAME")String  courseName,
                               @Param(value = "isNew")Integer isNew,
                               @Param(value = "id") Integer id);
    List<String> getAbleRooms(TcInfo tcInfo);

    int removeCoursesManager(List<Integer> list);

    int addCoursesManager(CourseManager courseManager);

    int modifyCoursesManager(CourseManager courseManager);

    List<TcInfo> getSemester(@Param(value="CNAME")String cName);

    String getCourseType(@Param(value = "CNAME") String cName);

    List<Integer> getAbleSemester(@Param(value = "CNAME") String cName,
                                  @Param(value = "type") String type);


    List<Integer> getDay(PartTcInfo partTcInfo);

    List<Integer> getIndexCourse(CourseManager courseManager);

    Integer getIsNewNumber(@Param("courseName") String courseName);

    Integer getClassNumberByDept(@Param("deptId") String deptId,@Param("year") String year);

    String getDeptId(@Param("courseName") String courseName);
}
