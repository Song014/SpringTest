package com.hr.project.dao;

import com.hr.project.service.User;
import com.hr.project.vo.UserVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<UserVO> selectList() {
        try {
            UserDAO mapper = sqlSession.getMapper(UserDAO.class);
            if(mapper != null){
            System.out.println(mapper.selectList());
                return mapper.selectList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
