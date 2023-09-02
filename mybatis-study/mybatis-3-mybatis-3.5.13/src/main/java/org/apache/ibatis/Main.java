package org.apache.ibatis;

import org.apache.ibatis.entity.NasUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapper.NasUserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Main {
  public static void main (String[] args) throws IOException {
    // 读取配置文件
    InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
    // 创建SqlSessionFactory
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    // 打开sqlSession
    SqlSession sqlSession = sqlSessionFactory.openSession();
    // 获取mapper接口对象
    NasUserMapper mapper = sqlSession.getMapper(NasUserMapper.class);
    // 调用数据库
    NasUser nasUser = mapper.selectByPrimaryKey(22);
    // 输出
    System.out.println(nasUser);
  }
}
