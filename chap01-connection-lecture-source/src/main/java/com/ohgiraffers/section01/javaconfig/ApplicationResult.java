package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;


public class ApplicationResult {


    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/menudb";
    private static String USER = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";

    public static void main(String[] args) {

        Environment environment = new Environment(
                "dev",                                 // 환경 정보 이름
                new JdbcTransactionFactory(),             // 트랜젝션 매니저 결정 (JDBC or MANAGED)
                new PooledDataSource(DRIVER, URL, USER, PASSWORD) // ConnectionPool 사용 유무(Pooled or UnPooled)
        );


        Configuration configuration = new Configuration(environment);

        configuration.addMapper(Mapper.class);


        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(configuration);

        SqlSession sqlSession = sqlSessionFactory.openSession(false);

        Mapper mapper = sqlSession.getMapper(Mapper.class);

        java.util.Date date = mapper.selectSysdate();

        System.out.println("date = " + date);

        sqlSession.close();
    }
}
