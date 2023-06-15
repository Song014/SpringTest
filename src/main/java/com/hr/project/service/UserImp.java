package com.hr.project.service;

import com.hr.project.dao.UserDAO;
import com.hr.project.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImp implements User{

    @Autowired
    private UserDAO ud;
    @Override
    public List<UserVO> getUser() {
        return ud.selectList();
    }
}
