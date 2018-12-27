package com.hellotiger.entity;

import com.hellotiger.XunwuApplicationTests;
import com.hellotiger.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: helloTiger
 * @Date: 2018/12/26 11:10
 * @Description:
 */
public class UserRepositoryTest extends XunwuApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public  void  testFindOne (){
        User user = userRepository.findOne(1L);
        System.out.println(user.getName());
        System.out.println(user.getId());
//        Assert.assertEquals("wali",user.getName());
    }
}
