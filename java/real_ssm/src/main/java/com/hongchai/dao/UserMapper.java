package com.hongchai.dao;


import com.hongchai.entity.User;
import com.hongchai.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserMapper {

    public void saveUser(User user){
        SqlSession session= MybatisUtil.getSqlSessionFactory().openSession();
        session.insert("insertUser",user);
        session.commit();
        session.close();
    }

    public void updateUser(User user){
        SqlSession session= MybatisUtil.getSqlSessionFactory().openSession();
        session.update("updateUser",user);
        session.commit();
        session.close();

    }
    public void deleteUser(int userId){
        SqlSession session=MybatisUtil.getSqlSessionFactory().openSession();
        session.delete("deleteUser",userId);
        session.commit();
        session.close();
    }
    public List<User> getAllUsers(){
        SqlSession session=MybatisUtil.getSqlSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<User> users=session.selectList("getAllUsers");
        session.commit();
        session.close();
        return  users;
    }
    public User findById(int userId){
        SqlSession session=MybatisUtil.getSqlSessionFactory().openSession();
        User user=(User)session.selectOne("findById",userId);
        session.commit();
        session.close();
        return  user;

    }
}
