package com.happysun.newcoder;

import com.happysun.newcoder.dao.UserMapper;
import com.happysun.newcoder.entity.User;
import com.happysun.newcoder.utils.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = NewcoderApplication.class)
public class SqlTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertTest(){
        User user = new User();
        user.setUsername("广广");
        user.setEmail("guangguang@qq.com");
        userMapper.insertUser(user);
    }
}