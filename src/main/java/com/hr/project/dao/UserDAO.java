package com.hr.project.dao;

import com.hr.project.vo.UserVO;

import java.util.List;

public interface UserDAO {
    List<UserVO> selectList();
}
