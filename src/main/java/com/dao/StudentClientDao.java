package com.dao;

import com.vo.studentClientVo.MyCourseStudentClientVo;
import com.vo.studentClientVo.SelectMyCourseVo;
import com.vo.studentClientVo.SelectStudentClientGrade;
import com.vo.studentClientVo.StudentClientVo;
import com.vo.studentInfoManager.SelectStudentInfoByTypeVo;
import com.vo.teacherClientVo.TeacherClientVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentClientDao {

    List<TeacherClientVo> getAllStudentCourseList(@Param("studentId")String studentId,@Param("semester") String semester);

    List<StudentClientVo> getAllStudentGradeList(SelectStudentClientGrade selectStudentClientGrade);

    List<MyCourseStudentClientVo> getAllMyCourseList(SelectMyCourseVo selectMyCourseVo);

    List<String> getThisTimeCourseManager(MyCourseStudentClientVo myCourseStudentClientVo);

    Integer AddChooseCourse(@Param("studentId")String studentId,@Param("id")String id);

    List<MyCourseStudentClientVo> getAllAlReadingCourse(SelectStudentClientGrade selectStudentClientGrade);

    Integer removeMyChooseCoursesList(MyCourseStudentClientVo myCourseStudentClientVo);

    String getGrade(@Param("studentId")String studentId,@Param("id")String id);
}
