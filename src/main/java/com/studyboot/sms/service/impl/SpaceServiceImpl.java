package com.studyboot.sms.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.studyboot.sms.dao.SpaceDao;
import com.studyboot.sms.domain.Space;
import com.studyboot.sms.domain.SpaceConvenienceInfo;
import com.studyboot.sms.domain.SpaceReview;
import com.studyboot.sms.service.SpaceService;

@Service
public class SpaceServiceImpl implements SpaceService {
  
  SpaceDao spaceDao;
  
  public SpaceServiceImpl(SpaceDao spaceDao) {
    this.spaceDao = spaceDao;
  }
  
  @Override
  public List<Space> list() {
    
    return spaceDao.findAll();
  }
  
  @Override
  public Space detail(int no) {
    
    Space space = spaceDao.findByNo(no);
    
    List<SpaceConvenienceInfo> sc = spaceDao.findConv(no);
    List<SpaceReview> sr = spaceDao.findReview(no);
    
    space.setSpaceConvenienceInfos(sc);
    space.setSpaceReview(sr);
    
    return space;
  }
}







