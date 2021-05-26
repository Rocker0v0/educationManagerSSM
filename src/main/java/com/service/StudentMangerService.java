package com.service;

import com.vo.studentInfoManager.SelectStudentInfoByTypeVo;
import com.vo.studentInfoManager.StudentInfoMangerVo;
import com.vo.studentInfoManager.TwoStudentInfoManagerVo;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface StudentMangerService {

    List<StudentInfoMangerVo> getStudentList(SelectStudentInfoByTypeVo selectStudentInfoByTypeVo);

    Integer addStudentList(StudentInfoMangerVo studentInfoMangerVo);

    Integer removeStudentList(List<String> list);

    Integer modifyStudentList(@RequestBody TwoStudentInfoManagerVo twoStudentInfoManagerVo);

    List<String> getClassNameInfoByMaxNumber(String majorName,String year);

}
