package com.controller.gradeManagerController;

import com.github.pagehelper.PageHelper;
import com.service.GradeManagerService;
import com.vo.gradeManagerVo.GradeManagerAllInfo;
import com.vo.gradeManagerVo.GradeManagerSelectByType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class GradeManager {

    @Resource
    private GradeManagerService gradeManagerService;

    @RequestMapping("/getGradeManagerAllInfo")
    @ResponseBody
    public Map<String, Object> getGradeManagerAllInfo(@RequestBody GradeManagerSelectByType gradeManagerSelectByType) {
        Map<String, Object> resMap = new HashMap<>();
        List<GradeManagerAllInfo> list1 = gradeManagerService.getGradeManagerAllList(gradeManagerSelectByType);
        Integer index = list1.size();
        PageHelper.startPage(gradeManagerSelectByType.getPage(), gradeManagerSelectByType.getItems());
        List<GradeManagerAllInfo> list2 = gradeManagerService.getGradeManagerAllList(gradeManagerSelectByType);
        resMap.put("status", 200);
        resMap.put("desc", "success!");
        resMap.put("data", list2);
        resMap.put("index", index);
        return resMap;
    }

    @RequestMapping("/getAllReadCourseNameInfo")
    @ResponseBody
    public Map<String, Object> getAllReadCourseNameInfo(String teacherId,String year) {
        Map<String, Object> resMap = new HashMap<>();
        List<String> list = gradeManagerService.getAllReadCourseName(teacherId,year);
        resMap.put("status", 200);
        resMap.put("desc", "success!");
        resMap.put("data", list);
        return resMap;
    }

    @RequestMapping("/getAllReadClassNameInfo")
    @ResponseBody
    public Map<String, Object> getAllReadClassNameInfo(Integer year, String courseName,String teacherId) {
        System.out.println(year);
        Map<String, Object> resMap = new HashMap<>();
        List<String> list = gradeManagerService.getAllReadClassName(year, courseName,teacherId);
        resMap.put("status", 200);
        resMap.put("desc", "success!");
        resMap.put("data", list);
        return resMap;
    }

    @RequestMapping("/removeScInfoByPrimaryIdsList")
    @ResponseBody
    public Map<String, Object> removeScInfoByPrimaryIdsList(@RequestBody List<Integer> list) {
        Map<String, Object> resMap = new HashMap<>();
        Integer items = gradeManagerService.removeScInfoByPrimaryIdsInfo(list);
        resMap.put("status", 200);
        resMap.put("desc", "success!");
        resMap.put("data", items);
        return resMap;
    }

    @RequestMapping("/modifyScInfoByPrimaryIdsList")
    @ResponseBody
    public Map<String, Object> modifyScInfoByPrimaryIdsList(Integer primaryId, Integer grade) {
        Map<String, Object> resMap = new HashMap<>();
        System.out.println(primaryId);
        System.out.println(grade);
        Integer items = gradeManagerService.modifyScInfoByPrimaryIdsInfo(primaryId, grade);
        resMap.put("status", 200);
        resMap.put("desc", "success!");
        resMap.put("data", items);
        return resMap;
    }

}
