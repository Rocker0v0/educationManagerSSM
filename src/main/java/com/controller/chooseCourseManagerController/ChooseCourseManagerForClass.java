package com.controller.chooseCourseManagerController;


import com.github.pagehelper.PageHelper;
import com.service.ChooseCourseForClassService;
import com.vo.chooseCourseVo.ChooseCourseAllInfo;
import com.vo.chooseCourseVo.ChooseCourseFormData;
import com.vo.chooseCourseVo.ChooseCourseRemoveInfo;
import com.vo.chooseCourseVo.ChooseCourseSelectByType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ChooseCourseManagerForClass {

    @Resource
    private ChooseCourseForClassService chooseCourseForClassService;

    @RequestMapping("/getDeptNameList")
    @ResponseBody
    public Map<String,Object> getDeptNameList(){
        Map<String,Object> map = new HashMap<>();
        List<String> list = chooseCourseForClassService.getDeptNameInfo();
        System.out.println(list);
        map.put("data",list);
        map.put("status",200);
        map.put("desc","success!");
        return map;
    }

    @RequestMapping("/getDeptNameListForStudent")
    @ResponseBody
    public Map<String,Object> getDeptNameListForStudent(){
        Map<String,Object> map = new HashMap<>();
        List<String> list = chooseCourseForClassService.getDeptNameInfoForStudent();
        System.out.println(list);
        map.put("data",list);
        map.put("status",200);
        map.put("desc","success!");
        return map;
    }

    @RequestMapping("/getMajorList")
    @ResponseBody
    public Map<String,Object> getMajorList(String deptName){
        Map<String,Object> map = new HashMap<>();
        System.out.println(deptName);
        List<String> list = chooseCourseForClassService.getMajorInfo(deptName);
        System.out.println(list);
        map.put("data",list);
        map.put("status",200);
        map.put("desc","success!");
        return map;
    }

    @RequestMapping("/getClassYearList")
    @ResponseBody
    public Map<String,Object> getClassYearList(){
        Map<String,Object> map = new HashMap<>();
        List<String> list = chooseCourseForClassService.getClassYearInfo();
        System.out.println(list);
        map.put("data",list);
        map.put("status",200);
        map.put("desc","success!");
        return map;
    }

    @RequestMapping("/getClassNameList")
    @ResponseBody
    public Map<String,Object> getClassNameList(String majorName,String year){
        Map<String,Object> map = new HashMap<>();
        List<String> list = chooseCourseForClassService.getClassNameInfo(majorName,year);
        System.out.println(list);
        map.put("data",list);
        map.put("status",200);
        map.put("desc","success!");
        return map;
    }

    @RequestMapping("/getCourseNameList")
    @ResponseBody
    public Map<String,Object> getCourseNameList(@RequestBody ChooseCourseFormData chooseCourseFormData){
        Map<String,Object> map = new HashMap<>();
        System.out.println(chooseCourseFormData);
        List<String> list = chooseCourseForClassService.getCourseNameInfo(chooseCourseFormData);
        System.out.println(list);
        map.put("data",list);
        map.put("status",200);
        map.put("desc","success!");
        return map;
    }

    @RequestMapping("/submitFormData")
    @ResponseBody
    public Map<String,Object> submitFormData(@RequestBody ChooseCourseFormData chooseCourseFormData){
        Map<String,Object> map = new HashMap<>();
        System.out.println(chooseCourseFormData);

       Integer statue= chooseCourseForClassService.submitFormDataInfo(chooseCourseFormData);
        map.put("status",statue);
        map.put("desc","success!");
        return map;
    }

    @RequestMapping("/getChooseCourseList")
    @ResponseBody
    public Map<String,Object> getChooseCourseList(@RequestBody ChooseCourseSelectByType chooseCourseSelectByType){
        Map<String,Object> map = new HashMap<>();
        List<ChooseCourseAllInfo> list1 = chooseCourseForClassService.getChooseCourseAllInfo(chooseCourseSelectByType);
        PageHelper.startPage(chooseCourseSelectByType.getPage(),chooseCourseSelectByType.getItems());
        List<ChooseCourseAllInfo> list2 = chooseCourseForClassService.getChooseCourseAllInfo(chooseCourseSelectByType);
        Integer index = list1.size();
        map.put("data",list2);
        map.put("status",200);
        map.put("index",index);
        map.put("desc","success!");
        return map;
    }

    @RequestMapping("/removeChooseCourseForClassList")
    @ResponseBody
    public Map<String,Object> removeChooseCourseForClassList(@RequestBody List<ChooseCourseRemoveInfo> list){
        Map<String,Object> resMap = new HashMap<>();
        chooseCourseForClassService.removeChooseCourseForClassInfo(list);
        resMap.put("status",200);
        resMap.put("desc","success!");
        return resMap;
    }

}
