package com.service.teacherClientServiceImp;

import com.dao.TeacherClientDao;
import com.service.TeacherClientService;
import com.vo.teacherClientVo.TeacherClientVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherClientServiceImpl implements TeacherClientService {

    @Resource
    private TeacherClientDao teacherClientDao;
    @Override
    public List<TeacherClientVo> getAllTeacherCourse(String teacherId, String type) {
        String str = null;
       String deptName=  teacherClientDao.getDeptByTeacherId(teacherId);
       if (deptName.equals("通识教育部")){
           str = null;
       }else{
           str = type;
       }
        return teacherClientDao.getAllTeacherCourseByTeacherId(teacherId,str);
    }
}
