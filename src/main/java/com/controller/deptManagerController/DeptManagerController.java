package com.controller.deptManagerController;

import com.github.pagehelper.PageHelper;
import com.service.CourseManagerService;
import com.service.DeptManagerService;
import com.vo.courseManagerVo.CourseManager;
import com.vo.deptManagerVo.DeptManagerVo;
import com.vo.deptManagerVo.SelectDeptManagerByType;
import com.vo.deptManagerVo.TwoDeptManagerVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DeptManagerController {

    @Resource
    DeptManagerService deptManagerService;

    @RequestMapping("/getDeptInfoList")
    @ResponseBody
    public Map<String,Object> getDeptInfoList(@RequestBody SelectDeptManagerByType selectDeptManagerByType) throws InterruptedException {
        Map<String,Object> map = new HashMap<>();
        List<DeptManagerVo> list1 = deptManagerService.getDeptManagerInfo(selectDeptManagerByType);
        PageHelper.startPage(selectDeptManagerByType.getPage(),selectDeptManagerByType.getItems());
        List<DeptManagerVo> list =  deptManagerService.getDeptManagerInfo(selectDeptManagerByType);
        int index = list1.size();
        map.put("data",list);
        map.put("index",index);
        return map;
    }

    @RequestMapping("/getDeptAndMajorNameList")
    @ResponseBody
    public Map<String,Object> getDeptAndMajorNameList() {
        Map<String,Object> map = new HashMap<>();
        List<String> list = deptManagerService.getDeptAndMajorNameInfo();
        map.put("data",list);
        map.put("status",200);
        return map;
    }

    @RequestMapping("/addDeptInfo")
    @ResponseBody
    public Map<String,Object> addDeptInfo(@RequestBody DeptManagerVo deptManagerVo) {
        Map<String,Object> map = new HashMap<>();
        Integer result = deptManagerService.addDeptList(deptManagerVo);
        map.put("desc","success");
        map.put("status",result);
        return map;
    }

    @RequestMapping("/removeDeptInfo")
    @ResponseBody
    public Map<String,Object> removeDeptInfo(@RequestBody List<String> list) {
        Map<String,Object> map = new HashMap<>();
        Integer result = deptManagerService.removeDeptList(list);
        map.put("desc","success");
        map.put("status",result);
        return map;
    }

    @RequestMapping("/modifyDeptInfo")
    @ResponseBody
    public Map<String,Object> modifyDeptInfo(@RequestBody TwoDeptManagerVo twoDeptManagerVo) {
        Map<String,Object> map = new HashMap<>();
        Integer result = deptManagerService.modifyDeptList(twoDeptManagerVo);
        map.put("desc","success");
        map.put("status",result);
        return map;
    }
}
