package com.controller.courseInfoController;

import com.github.pagehelper.PageHelper;
import com.service.CourseInfoService;
import com.service.DeptManagerService;
import com.vo.courseInfoVo.CourseInfoVo;
import com.vo.courseInfoVo.SelectCourseInfoByType;
import com.vo.courseInfoVo.TwoCourseInfoVo;
import com.vo.deptManagerVo.DeptManagerVo;
import com.vo.deptManagerVo.SelectDeptManagerByType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CourseInfoController {

    @Resource
    CourseInfoService courseInfoService;

    @RequestMapping("/getCourseInfoList")
    @ResponseBody
    public Map<String,Object> getCourseInfoList(@RequestBody SelectCourseInfoByType selectCourseInfoByType) {
        Map<String,Object> map = new HashMap<>();
        List<CourseInfoVo> list1 = courseInfoService.getAllCourseList(selectCourseInfoByType);
        PageHelper.startPage(selectCourseInfoByType.getPage(),selectCourseInfoByType.getItems());
        List<CourseInfoVo> list =  courseInfoService.getAllCourseList(selectCourseInfoByType);
        int index = list1.size();
        map.put("data",list);
        map.put("index",index);
        return map;
    }

    @RequestMapping("/getAbleDeptListForCourseInfo")
    @ResponseBody
    public Map<String,Object> getAbleDeptListForCourseInfo(String type) {
        Map<String,Object> map = new HashMap<>();
        List<String> list = courseInfoService.getAbleDeptList(type);
        map.put("data",list);
        map.put("status",200);
        return map;
    }

    @RequestMapping("/addCourseInfo")
    @ResponseBody
    public Map<String,Object> addCourseInfo(@RequestBody CourseInfoVo courseInfoVo) {
        Map<String,Object> map = new HashMap<>();
        Integer res  = courseInfoService.addCourseList(courseInfoVo);
        map.put("desc","success");
        map.put("status",res);
        return map;
    }

    @RequestMapping("/modifyCourseInfo")
    @ResponseBody
    public Map<String,Object> modifyCourseInfo(@RequestBody TwoCourseInfoVo twoCourseInfoVo) {
        Map<String,Object> map = new HashMap<>();
        Integer res  = courseInfoService.modifyCourseList(twoCourseInfoVo);
        map.put("desc","success");
        map.put("status",res);
        return map;
    }

    @RequestMapping("/removeCourseInfo")
    @ResponseBody
    public Map<String,Object> removeCourseInfo(@RequestBody List<String> list) {
        Map<String,Object> map = new HashMap<>();
        Integer result = courseInfoService.removeCourseList(list);
        map.put("desc","success");
        map.put("status",result);
        return map;
    }
}
