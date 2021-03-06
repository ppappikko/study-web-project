package com.studyboot.sms.dao;

import java.util.List;
import java.util.Map;
import com.studyboot.sms.domain.History;
import com.studyboot.sms.domain.StudyMember;

public interface StudyMemberDao {
  
  int insert(StudyMember studyMember);
  List<StudyMember> findAll();
  
  // 스터디 넘버로 스터디 구성원 가져오기
  List<StudyMember> findStudyMembersByNo(int no);
  
  StudyMember findByNo(int no);
  //int increaseCount(int no);
  int update(StudyMember studyMember);
  int attendUpdate(Map<String, Object> map);
  int delete(int no);
  int countEndStudyByMemberNo(int no);
  List<Integer> findStudyNoByMemberNo(int no);
  boolean findStudyMemberLeaderByMap(Map<String, Object> map);
  StudyMember findMyStudyByNo(Map<String, Object> map);
  List<StudyMember> findRateInfoByMemberId(int no);
  List<History> findHistoryByMemberId(Map<String,Object> params);
  int add(Map<String, Object> params);
  boolean checkCapacityByStudyNo(int studyNo);
  int attendPercentUpdate(Map<String, Object> map);
}
