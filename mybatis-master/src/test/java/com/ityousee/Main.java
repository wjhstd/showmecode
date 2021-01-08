package com.ityousee;

import com.ityousee.dao.ConfigDao;
import com.ityousee.model.Config;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main (String[] args) throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //生成一个SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder  = new SqlSessionFactoryBuilder();
        //创建一个SqlSessionFactory对象
        SqlSessionFactory factory  = builder.build(inputStream);
        //获得一个SqlSession对象
        SqlSession session=factory.openSession();
        //获得一个UserMapper
        ConfigDao configDao = session.getMapper(ConfigDao.class);

        List<Config> configs = configDao.findAllConfig();
        for (Config config : configs){
            System.out.println(config.getConfigName() + " : " + config.getConfigValue());
        }
    }
}
