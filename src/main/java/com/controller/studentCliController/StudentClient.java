package com.controller.studentCliController;

import com.github.pagehelper.PageHelper;
import com.service.StudentClientService;
import com.service.StudentMangerService;
import com.service.TeacherClientService;
import com.vo.deptManagerVo.DeptManagerVo;
import com.vo.studentClientVo.MyCourseStudentClientVo;
import com.vo.studentClientVo.SelectMyCourseVo;
import com.vo.studentClientVo.SelectStudentClientGrade;
import com.vo.studentClientVo.StudentClientVo;
import com.vo.teacherClientVo.TeacherClientVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentClient {
    @Resource
    private StudentClientService studentClientService;


    @RequestMapping("/getStudentCourse")
    @ResponseBody
    public Map<String,Object> getStudentCourse(String studentId, String semester) {
        Map<String,Object> map = new HashMap<>();
        List<TeacherClientVo> data  = studentClientService.getAllStudentCourseByStudentId(studentId,semester);
        map.put("desc","success");
        map.put("status",200);
        map.put("data",data);
        return map;
    }

    @RequestMapping("/getAllGradeForStudentCli")
    @ResponseBody
    public Map<String,Object> getAllGradeForStudentCli(@RequestBody SelectStudentClientGrade selectStudentClientGrade) {
        Map<String,Object> map = new HashMap<>();
        System.out.println(selectStudentClientGrade);
        List<StudentClientVo> list1 = studentClientService.getAllStudentGradeInfo(selectStudentClientGrade);
        PageHelper.startPage(selectStudentClientGrade.getPage(),selectStudentClientGrade.getItems());
        List<StudentClientVo> list =  studentClientService.getAllStudentGradeInfo(selectStudentClientGrade);
        int index = list1.size();
        map.put("data",list);
        map.put("index",index);
        return map;
    }


    @RequestMapping("/getAllMyCourse")
    @ResponseBody
    public Map<String,Object> getAllMyCourse(@RequestBody SelectMyCourseVo selectMyCourseVo) {
        Map<String,Object> map = new HashMap<>();
        System.out.println(selectMyCourseVo);
        List<MyCourseStudentClientVo> list1 = studentClientService.getAllMyCourseInfo(selectMyCourseVo);
        PageHelper.startPage(selectMyCourseVo.getPage(),selectMyCourseVo.getItems());
        List<MyCourseStudentClientVo> list =  studentClientService.getAllMyCourseInfo(selectMyCourseVo);
        int index = list1.size();
        map.put("data",list);
        map.put("index",index);
        return map;
    }


    @RequestMapping("/chooseMyCourse")
    @ResponseBody
    public Map<String,Object> chooseMyCourse(@RequestBody MyCourseStudentClientVo myCourseStudentClientVo) {
        Map<String,Object> map = new HashMap<>();
       Integer status = studentClientService.ChooseCourseByStudentId(myCourseStudentClientVo);
        map.put("status",status);
        map.put("desc","success");
        return map;
    }



    @RequestMapping("/getAllAlReadingCourse")
    @ResponseBody
    public Map<String,Object> getAllAlReadingCourse(@RequestBody SelectStudentClientGrade selectStudentClientGrade) {
        Map<String,Object> map = new HashMap<>();
        List<MyCourseStudentClientVo> list1 = studentClientService.getAllAlReadingCourseInfo(selectStudentClientGrade);
        PageHelper.startPage(selectStudentClientGrade.getPage(),selectStudentClientGrade.getItems());
        List<MyCourseStudentClientVo> list2 = studentClientService.getAllAlReadingCourseInfo(selectStudentClientGrade);
        Integer index =  list1.size();
        map.put("status",200);
        map.put("desc","success");
        map.put("data",list2);
        map.put("index",index);
        return map;
    }

    @RequestMapping("/removeMyChooseCourse")
    @ResponseBody
    public Map<String,Object> removeMyChooseCourse(@RequestBody MyCourseStudentClientVo myCourseStudentClientVo) {
        Map<String,Object> map = new HashMap<>();
        Integer status = studentClientService.removeMyCourseInfo(myCourseStudentClientVo);
        map.put("status",status);
        map.put("desc","success");
        return map;
    }
}
