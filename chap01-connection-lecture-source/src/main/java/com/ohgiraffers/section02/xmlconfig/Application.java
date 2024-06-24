package com.ohgiraffers.section02.xmlconfig;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class Application {

    public static void main(String[] args) {

        // MYBATIS 설정 파일의 경로를 지정
        String resource = "mybatis-config.xml";

        try {
            // MYBATIS 설정 파일을 읽어오기
            InputStream inputStream = Resources.getResourceAsStream(resource);

            // 설정파일로 SqlSessionFactory 만들기
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            // SqlSession 생성
            SqlSession sqlSession = sqlSessionFactory.openSession(false);

            Date date = sqlSession.selectOne("mapper.selectSysdate");

            System.out.println(date);

            // 세션반납
            sqlSession.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
