package com.happysun.newcoder;

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
public class MailTest {
    @Autowired
    private MailClient mailClient;

    @Test
    public void testTextMail(){

//        mailClient.sendMail("1179044981@qq.com","baobao","love you");
    }
}
