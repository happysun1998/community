package com.happysun.newcoder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = NewcoderApplication.class)
public class LogTest {
    Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void logTest(){
        logger.debug("debug logger");
        logger.info("info logger");
        logger.warn("warn logger");
        logger.error("error logger");
    }
}
