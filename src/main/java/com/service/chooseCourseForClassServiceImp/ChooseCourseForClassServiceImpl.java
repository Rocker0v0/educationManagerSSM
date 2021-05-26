package com.service.chooseCourseForClassServiceImp;

import com.dao.ChooseCourseForClass;
import com.service.ChooseCourseForClassService;
import com.vo.chooseCourseVo.ChooseCourseAllInfo;
import com.vo.chooseCourseVo.ChooseCourseFormData;
import com.vo.chooseCourseVo.ChooseCourseRemoveInfo;
import com.vo.chooseCourseVo.ChooseCourseSelectByType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ChooseCourseForClassServiceImpl implements ChooseCourseForClassService {

    @Resource
    private ChooseCourseForClass chooseCourseForClass;
    @Override
    public List<String> getDeptNameInfo() {
       List<String> list = chooseCourseForClass.getDeptNameList();
        return list;
    }

    @Override
    public List<String> getDeptNameInfoForStudent() {
        List<String> list = chooseCourseForClass.getDeptNameListForStudent();
        return list;
    }

    @Override
    public List<String> getMajorInfo(String deptName) {
       List<String> list = chooseCourseForClass.getMajorList(deptName);
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String x = it.next();
            if(x.equals(deptName)){
                it.remove();
            }
        }
        return list;
    }

    @Override
    public List<String> getClassYearInfo() {
        List<String> list = chooseCourseForClass.getClassYearList();
        return  list;
    }

    @Override
    public List<String> getClassNameInfo(String majorName,String year) {
        List<String> list = chooseCourseForClass.getClassNameList(majorName,year);
        return list;
    }

    @Override
    public List<String> getCourseNameInfo(ChooseCourseFormData chooseCourseFormData) {

        System.out.println(chooseCourseFormData);
        List<String> list = chooseCourseForClass.getCourseNameList(chooseCourseFormData);
        List<String> AbleIsNewList = chooseCourseForClass.getThisClassTcInfo(chooseCourseFormData);
        List<String> relList = new ArrayList<>();
        for (String items:list) {
            if (AbleIsNewList.size() == 0){
                relList.add(items);
            }else{
                if (chooseCourseForClass.getTcId(items,AbleIsNewList.get(0))!=null){
                    relList.add(items);
                }
            }

        }
        return relList;
    }

    @Override
    public Integer submitFormDataInfo(ChooseCourseFormData chooseCourseFormData) {

        String TcId = null;
       List<String> list = chooseCourseForClass.getThisClassTcInfo(chooseCourseFormData);
        System.out.println(list);
        if (list.size() == 0){
          List<String> list1 =  chooseCourseForClass.getAbleChooseIsNews(chooseCourseFormData);
            TcId = chooseCourseForClass.getTcId(chooseCourseFormData.getCourseName(),list1.get(0));
        }else{
            TcId = chooseCourseForClass.getTcId(chooseCourseFormData.getCourseName(),list.get(0));
        }
        System.out.println(TcId);

       List<String> stuIdList =  chooseCourseForClass.getStudentsIdList(chooseCourseFormData.getClassName(),chooseCourseFormData.getYear());

        System.out.println(stuIdList);
        for (String index:stuIdList) {
           Integer statue = chooseCourseForClass.insertScInfo(index,TcId);
            System.out.println(statue);
        }
        return 1;
    }

    @Override
    public List<ChooseCourseAllInfo> getChooseCourseAllInfo(ChooseCourseSelectByType chooseCourseSelectByType) {
        List<ChooseCourseAllInfo> list = chooseCourseForClass.getChooseCourseAllList(chooseCourseSelectByType);
        return list;
    }

    @Override
    public Integer removeChooseCourseForClassInfo(List<ChooseCourseRemoveInfo> list) {

        Integer Statue  = 0;
        for (ChooseCourseRemoveInfo index: list
             ) {
            Statue +=  chooseCourseForClass.removeChooseCourseForClass(index.getId(),index.getYear(),index.getClassName());
        }
        return Statue;
    }
}
