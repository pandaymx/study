package com.ppmb.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    //静态加载mybatis的核心配置文件
    static
    {
        try
        {
            //获取SqlSessionFactory对象
            String resource = "mybatis-context.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    //获取SqlSession对象
    public static SqlSession getSqlSession()
    {
        return sqlSessionFactory.openSession();
    }
}
