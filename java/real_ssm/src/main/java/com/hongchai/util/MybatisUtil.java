package com.hongchai.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class MybatisUtil {

    private static SqlSessionFactory  sqlSessionFactory;

    static {
        Reader reader;
        try {
           reader= Resources.getResourceAsReader("c:/mybatis-config.xml");

           sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }
}
