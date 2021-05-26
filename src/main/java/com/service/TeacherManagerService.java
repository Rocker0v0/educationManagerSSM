package com.service;

import com.vo.studentInfoManager.SelectStudentInfoByTypeVo;
import com.vo.studentInfoManager.TwoStudentInfoManagerVo;
import com.vo.teacherInfoManager.SelectTeacherInfoByType;
import com.vo.teacherInfoManager.TeacherInfoManagerVo;
import com.vo.teacherInfoManager.TwoTeacherInfoManagerVo;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TeacherManagerService {

    List<TeacherInfoManagerVo> getAllTeacherInfo(SelectTeacherInfoByType selectTeacherInfoByType);

    Integer addTeacherList(TeacherInfoManagerVo teacherInfoManagerVo);

    Integer removeTeacherList(List<String> list);

    Integer modifyTeacherList(@RequestBody TwoTeacherInfoManagerVo twoTeacherInfoManagerVo);


}
