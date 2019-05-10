package com.studyboot.sms.service.impl;

import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;
import com.studyboot.sms.dao.SpaceDao;
import com.studyboot.sms.domain.Space;
import com.studyboot.sms.service.SpaceService;

@Service
public class SpaceServiceImpl implements SpaceService {
  
  SpaceDao spaceDao;
  
  public SpaceServiceImpl(SpaceDao spaceDao) {
    this.spaceDao = spaceDao;
  }
  
  @Override
  public List<Space> list() {
    
    HashMap<String,Object> params = new HashMap<>();
    
    return spaceDao.findAll(params);
  }
  
//  @Override
//  public int add(Space space) {
//    // 이 메서드도 하는 일이 없다.
//    // 그래도 일관된 프로그래밍을 위해 Command 객체는 항상 Service 객체를 경유하여 DAO를 사용해야 한다.
//    return spaceDao.insert(space);
//  }
//  
//  @Override
//  public Space get(int no) {
//    // 이제 조금 서비스 객체가 뭔가를 하는 구만.
//    // Command 객체는 데이터를 조회한 후 조회수를 높이는 것에 대해 신경 쓸 필요가 없어졌다.
//    Space space = spaceDao.findByNo(no);
//    if (space != null) {
//      spaceDao.increaseCount(no);
//    }
//    return space;
//  }
//  
//  @Override
//  public int update(Space space) {
//    // 이 메서드도 별로 할 일이 없다.
//    // 그냥 DAO를 실행시키고 리턴 값을 그대로 전달한다.
//    return spaceDao.update(space);
//  }
//  
//  @Override
//  public int delete(int no) {
//    // 이 메서드도 그냥 DAO에 명령을 전달하는 일을 한다.
//    // 그래도 항상 Command 객체는 이 Service 객체를 통해서 데이터를 처리해야 한다.
//    return spaceDao.delete(no);
//  }
//  
//  @Override
//  public int size() {
//    // 전체 게시물의 개수
//    return spaceDao.countAll();
//  }
}






