package com.service.studentClientService;

import com.dao.StudentClientDao;
import com.dao.StudentManagerDao;
import com.service.StudentClientService;
import com.vo.studentClientVo.MyCourseStudentClientVo;
import com.vo.studentClientVo.SelectMyCourseVo;
import com.vo.studentClientVo.SelectStudentClientGrade;
import com.vo.studentClientVo.StudentClientVo;
import com.vo.teacherClientVo.TeacherClientVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentClientServiceImpl implements StudentClientService {

    @Resource
    private StudentClientDao studentClientDao;

    @Override
    public List<TeacherClientVo> getAllStudentCourseByStudentId(String studentId, String semester) {
         return   studentClientDao.getAllStudentCourseList(studentId,semester);
    }

    @Override
    public List<StudentClientVo> getAllStudentGradeInfo(SelectStudentClientGrade selectStudentClientGrade) {
        return studentClientDao.getAllStudentGradeList(selectStudentClientGrade);
    }

    @Override
    public List<MyCourseStudentClientVo> getAllMyCourseInfo(SelectMyCourseVo selectMyCourseVo) {
        return studentClientDao.getAllMyCourseList(selectMyCourseVo);
    }

    @Override
    public Integer ChooseCourseByStudentId(MyCourseStudentClientVo myCourseStudentClientVo) {
      List<String> list = studentClientDao.getThisTimeCourseManager(myCourseStudentClientVo);
      System.out.println(list);
      if(list.size()==0){
         Integer index =  studentClientDao.AddChooseCourse(myCourseStudentClientVo.getStudentId(),myCourseStudentClientVo.getId());
          return index;
      }else {
        return -1;
      }
    }

    @Override
    public List<MyCourseStudentClientVo> getAllAlReadingCourseInfo(SelectStudentClientGrade selectStudentClientGrade) {
        System.out.println(selectStudentClientGrade);
        return studentClientDao.getAllAlReadingCourse(selectStudentClientGrade);
    }

    @Override
    public Integer removeMyCourseInfo(MyCourseStudentClientVo myCourseStudentClientVo) {

       String  str = studentClientDao.getGrade(myCourseStudentClientVo.getStudentId(),myCourseStudentClientVo.getId());
       if (str != null){
           return -2;
       }
        return studentClientDao.removeMyChooseCoursesList(myCourseStudentClientVo);
    }
}
