package com.service.teacherManagerServiceImp;

import com.dao.TeacherInfoManagerDao;
import com.service.TeacherManagerService;
import com.vo.studentInfoManager.SelectStudentInfoByTypeVo;
import com.vo.teacherInfoManager.SelectTeacherInfoByType;
import com.vo.teacherInfoManager.TeacherInfoManagerVo;
import com.vo.teacherInfoManager.TwoTeacherInfoManagerVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherManagerServiceImpl implements TeacherManagerService {

    @Resource
    private TeacherInfoManagerDao teacherInfoManagerDao;
    @Override
    public List<TeacherInfoManagerVo> getAllTeacherInfo(SelectTeacherInfoByType selectTeacherInfoByType) {
        List<TeacherInfoManagerVo> list = teacherInfoManagerDao.getAllTeacherInfo(selectTeacherInfoByType);
        return list;
    }

    @Override
    public Integer addTeacherList(TeacherInfoManagerVo teacherInfoManagerVo) {

       String teacherId =  teacherInfoManagerDao.getTeacherIdByTeacherName(teacherInfoManagerVo.getTeacherName());
       if (teacherId!=null){
           return -1;
       }
        String initStr = "10459";
        boolean statue = true;
        Integer currentIndex = 0;
        String strId = "";
        while(statue){
            currentIndex++;
            if(currentIndex<10){
                strId = "00"+currentIndex;
            }else if (currentIndex<100){
                strId = "0"+currentIndex;
            }else{
                strId = currentIndex+"";
            }
            String studentName =  teacherInfoManagerDao.getTeacherNameByTeacherId(initStr+strId);
            if (studentName == null){
                statue = false;
            }
        }
        teacherInfoManagerVo.setTeacherId(initStr+strId);
        System.out.println(teacherInfoManagerVo);
       Integer items = teacherInfoManagerDao.addTeacherManagerInfo(teacherInfoManagerVo);
        return items;
    }

    @Override
    public Integer removeTeacherList(List<String> list) {
       Integer items =  teacherInfoManagerDao.removeTeacherByStudentId(list);
        return items;
    }

    @Override
    public Integer modifyTeacherList(TwoTeacherInfoManagerVo twoTeacherInfoManagerVo) {
        System.out.println(twoTeacherInfoManagerVo);
        if (twoTeacherInfoManagerVo.getOldTeacherInfoManagerVo().equals(twoTeacherInfoManagerVo.getNewTeacherInfoManagerVo())){
            return -1;
        }

        if(twoTeacherInfoManagerVo.getOldTeacherInfoManagerVo().getDeptName().equals(twoTeacherInfoManagerVo.getNewTeacherInfoManagerVo().getDeptName())){
         Integer items =  teacherInfoManagerDao.updateTeacherInfo(twoTeacherInfoManagerVo.getNewTeacherInfoManagerVo());

        }else{
//            删除
            List<String> list = new ArrayList<>();
           list.add(twoTeacherInfoManagerVo.getOldTeacherInfoManagerVo().getTeacherId());
            Integer removeStatue = this.removeTeacherList(list);
//            增加
            if (removeStatue !=0){
                this.addTeacherList(twoTeacherInfoManagerVo.getNewTeacherInfoManagerVo());
            }
        }
        return 200;
    }
}
