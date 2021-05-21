package com.test.springboot.my;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplication {

    @Autowired
    ApplicationContext context;


    @Test
    public void test1(){
		Date bean = context.getBean(Date.class);
		System.out.println(bean);
	}

}
