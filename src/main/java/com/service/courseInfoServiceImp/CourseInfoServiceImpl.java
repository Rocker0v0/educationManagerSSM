package com.service.courseInfoServiceImp;

import com.dao.CourseInfoDao;
import com.service.CourseInfoService;
import com.vo.courseInfoVo.CourseInfoVo;
import com.vo.courseInfoVo.SelectCourseInfoByType;
import com.vo.courseInfoVo.TwoCourseInfoVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseInfoServiceImpl implements CourseInfoService {

    @Resource
    private CourseInfoDao courseInfoDao;

    @Override
    public List<CourseInfoVo> getAllCourseList(SelectCourseInfoByType selectCourseInfoByType) {
        List<CourseInfoVo> list = courseInfoDao.getAllCourseInfo(selectCourseInfoByType);
        return list;
    }

    @Override
    public List<String> getAbleDeptList(String type) {
        return courseInfoDao.getDeptNameForCoursesInfo(type);
    }

    @Override
    public Integer addCourseList(CourseInfoVo courseInfoVo) {
        Integer result = null;
        System.out.println(courseInfoVo);
      String courseId =   courseInfoDao.getCourseIdByName(courseInfoVo.getCourseName());

      if (courseId!=null){
          result = -1;
          return result;
      }

      result = courseInfoDao.addCourseInfo(courseInfoVo);
        return result;
    }

    @Override
    public Integer modifyCourseList(TwoCourseInfoVo twoCourseInfoVo) {

        Integer items = null;
        if (twoCourseInfoVo.getOldCourseInfoVo().equals(twoCourseInfoVo.getNewCourseInfoVo())){
            items = -2;
            return items;
        }
        String deptId = courseInfoDao.getCourseIdByName(twoCourseInfoVo.getNewCourseInfoVo().getCourseName());
        if(deptId!=null && twoCourseInfoVo.getOldCourseInfoVo().getCredits().equals(twoCourseInfoVo.getNewCourseInfoVo().getCredits())){
            items = -1;
            return items;
        }
        items =  courseInfoDao.modifyCourseInfo(twoCourseInfoVo.getNewCourseInfoVo());
        return items;

    }

    @Override
    public Integer removeCourseList(List<String> list) {
       Integer result =  courseInfoDao.removeCourseInfo(list);
        return result;
    }
}
