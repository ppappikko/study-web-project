package com.studyboot.sms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.studyboot.sms.domain.Study;

public interface StudyDao {
  
  int insert(Study study);
  Study findByNo(int no);
  //int increaseCount(int no);
  int update(Study study);
  int delete(int no);
  int countAll(Map<String, Object> params);
  int countAllByKeyword(HashMap<String, Object> params);
  List<Study> findAll(Map<String, Object> params);
  List<Study> findAllByKeyword(HashMap<String, Object> params);
  List<Study> findByNos(List<Integer> list);
  Study findPhotoByNo(int no);
  List<Study> findPickedStudyByUser(int no);
  boolean checkFullCapacityByStudyNo(int studyNo);
  int updateAllStudyRecruitState();
  int updateAllStudyRecruitState2();
  int updateAllStudyRecruitState3();
  int insertPickedStudyByUserNoAndStudyNo(HashMap<String, Object> params);
  int deletePickedStudyByUserNoAndStudyNo(HashMap<String, Object> params);
  int addPrsn(int stdNo);
}
