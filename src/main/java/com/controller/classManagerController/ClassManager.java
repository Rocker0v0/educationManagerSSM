package com.controller.classManagerController;

import com.dao.ClassManagerDao;
import com.github.pagehelper.PageHelper;
import com.service.ClassManagerService;
import com.vo.classManagerVo.ClassManagerVo;
import com.vo.classManagerVo.SelectClassManagerInfoByType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ClassManager {

    @Resource
    private ClassManagerService classManagerService;

    @RequestMapping("/getClassManagerInfo")
    @ResponseBody
    public Map<String, Object> getClassManagerInfo(@RequestBody SelectClassManagerInfoByType selectClassManagerInfoByType) {
        Map<String, Object> resMap = new HashMap<>();
        System.out.println(selectClassManagerInfoByType);
        List<ClassManagerVo> list1 = classManagerService.getAllClassManagerList(selectClassManagerInfoByType);
        PageHelper.startPage(selectClassManagerInfoByType.getPage(),selectClassManagerInfoByType.getItems());
        List<ClassManagerVo> list2 = classManagerService.getAllClassManagerList(selectClassManagerInfoByType);
        Integer index = list1.size();
        resMap.put("status", 200);
        resMap.put("desc", "success!");
        resMap.put("data", list2);
        resMap.put("index",index);
        return resMap;
    }

    @RequestMapping("/getAbleTeacherNameList")
    @ResponseBody
    public Map<String, Object> getAbleTeacherNameList(String deptName) {
        Map<String, Object> resMap = new HashMap<>();
        List<String> ableTeacherNameInfo = classManagerService.getAbleTeacherNameInfo(deptName);
        resMap.put("status", 200);
        System.out.println(ableTeacherNameInfo);
        resMap.put("desc", "success!");
        resMap.put("data", ableTeacherNameInfo);
        return resMap;
    }

    @RequestMapping("/getMajorListByYear")
    @ResponseBody
    public Map<String, Object> getMajorListByYear(String deptName,String year) {
        Map<String, Object> resMap = new HashMap<>();
        List<String> list = classManagerService.getMajorListByYearInfo(deptName,year);
        resMap.put("status", 200);
        resMap.put("desc", "success!");
        resMap.put("data", list);
        return resMap;
    }

    @RequestMapping("/addClassManagerList")
    @ResponseBody
    public Map<String, Object> addClassManagerList(@RequestBody ClassManagerVo classManagerVo) {
        Map<String, Object> resMap = new HashMap<>();
        Integer result = classManagerService.addClassManagerInfo(classManagerVo);
        resMap.put("status", result);
        resMap.put("desc", "success!");
        return resMap;
    }

    @RequestMapping("/removeClassManagerList")
    @ResponseBody
    public Map<String, Object> removeClassManagerList(@RequestBody List<String> list) {
        Map<String, Object> resMap = new HashMap<>();
        Integer result = classManagerService.removeClassManagerInfo(list);
        resMap.put("status", result);
        resMap.put("desc", "success!");
        return resMap;
    }

    @RequestMapping("/modifyClassManagerList")
    @ResponseBody
    public Map<String, Object> modifyClassManagerList(@RequestBody ClassManagerVo classManagerVo) {
        Map<String, Object> resMap = new HashMap<>();
        Integer result = classManagerService.modifyClassManagerInfo(classManagerVo);
        resMap.put("status", result);
        resMap.put("desc", "success!");
        return resMap;
    }
}
