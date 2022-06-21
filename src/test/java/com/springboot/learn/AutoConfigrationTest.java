package com.springboot.learn;

import com.qingclean.springboot.service.ISplitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author amazfit
 * @date 2022-06-06 上午7:22
 **/
@SpringBootTest
public class AutoConfigrationTest {

    @Autowired
    private ISplitService splitServiceImpl;

    @Test
    public void splitTest(){
        System.out.println(splitServiceImpl.split("康师傅,统一老谭,日清"));
    }
}
