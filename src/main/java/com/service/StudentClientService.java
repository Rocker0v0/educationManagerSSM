package com.service;

import com.vo.studentClientVo.MyCourseStudentClientVo;
import com.vo.studentClientVo.SelectMyCourseVo;
import com.vo.studentClientVo.SelectStudentClientGrade;
import com.vo.studentClientVo.StudentClientVo;
import com.vo.teacherClientVo.TeacherClientVo;

import java.util.List;

public interface StudentClientService {

    List<TeacherClientVo> getAllStudentCourseByStudentId(String studentId,String semester);

    List<StudentClientVo> getAllStudentGradeInfo(SelectStudentClientGrade selectStudentClientGrade);

    List<MyCourseStudentClientVo> getAllMyCourseInfo(SelectMyCourseVo selectMyCourseVo);

    Integer ChooseCourseByStudentId(MyCourseStudentClientVo myCourseStudentClientVo);

    List<MyCourseStudentClientVo> getAllAlReadingCourseInfo(SelectStudentClientGrade selectStudentClientGrade);

    Integer removeMyCourseInfo(MyCourseStudentClientVo myCourseStudentClientVo);
}
