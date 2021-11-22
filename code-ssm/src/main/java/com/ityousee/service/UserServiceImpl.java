package com.ityousee.service;


import com.ityousee.dao.UserMapper;
import com.ityousee.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 *@ClassName: UserServiceImpl
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/5/11 14:43
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private UrServiceImpl urService;
    @Autowired
    private TransactionTemplate txTemplate;
    
    @Autowired
    private TestClass testClass;
    
    @Override
    public User getAll () {
        
        return userMapper.getAll();
    }
    
    public void update1 () {
        
        System.out.println(txTemplate.getPropagationBehavior());
        txTemplate.execute(new TransactionCallback<Void>() {
            @Override
            public Void doInTransaction (TransactionStatus status) {
                
                User user = new User();
                user.setUser_name("bmw");
                userMapper.update(user);
                urService.insert2();
                System.out.println(1/0);
                return null;
            }
        });
        
        
    }
    
    public void update2 () {
        
        User user = new User();
        user.setUser_name("bmw");
        userMapper.update(user);
        insert1();
    }
    
    
    public void update3 () {
        
        
        User user = new User();
        user.setUser_name("bmw");
        userMapper.update(user);
        insert1();
//        System.out.println(1 / 0);
    
    
    }
    
    public void insert1 () {
//        txTemplate.setPropagationBehavior(4);
        txTemplate.execute(new TransactionCallback<Void>() {
            @Override
            public Void doInTransaction (TransactionStatus status) {
                
                User user = new User();
                user.setUser_name("new1");
                user.setUser_email("111111111");
                user.setUser_phone("222222222");
                user.setUser_gender("3333333");
                userMapper.insert(user);
//                status.setRollbackOnly();
//                user.setUser_name("new2");
//                user.setUser_email("333");
//                user.setUser_phone("666");
//                user.setUser_gender("sssbbbs");
//                userMapper.insert(user);
//               status.setRollbackOnly();

//                testClass.insert1();
                System.out.println(1/0);
                return null;
            }
        });
        
        
    }
    
    public void insert2 () {
        try {
            User user = new User();
            user.setUser_name("new2");
            user.setUser_email("444444");
            user.setUser_phone("555555");
            user.setUser_gender("66666");
            userMapper.insert(user);
//                status.setRollbackOnly();
//            user.setUser_name("new2");
//            user.setUser_email("333");
//            user.setUser_phone("666");
//            user.setUser_gender("sssbbbs");
//            userMapper.insert(user);
            insert1();
            
        
    
        }catch (Exception e){
           throw e;
        }
       
    
    }
}
