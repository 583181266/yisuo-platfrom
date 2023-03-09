package com.yisuo.yisuoplatform.system.service;
import java.util.Date;

import com.yisuo.yisuoplatform.system.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserServiceTest {

    @Resource
    private UserService userService;


    @Test
    void testSave() {
        User user = new User();
        user.setUsername("王五");
        user.setPassword("123456");
        user.setGender((short)0);
        user.setIdCard("1234252333455643");
        user.setEmail("5678765@qq.com");
        user.setPhone("123322342242");
        user.setBirthday(new Date());
        user.setAge(19);
        user.setStatus((short)0);
        user.setLastLogin(new Date());
        user.setCreateBy(0);
        user.setCreateTime(new Date());
        user.setUpdatedBy(0);
        user.setUpdatedTime(new Date());
        user.setIsDeleted((short)0);
        user.setRemark("test");

        userService.save(user);
    }

    @Test
    void testFindById() {
        User user = userService.findById(3);
        System.out.println(user);
    }

    @Test
    void testUpdate() {
        User user = userService.findById(3);
        System.out.println(user);
        user.setUsername("张二麻子");
        System.out.println(user);
    }

    @Test
    void testDelete() {
        userService.deleteById(3);
        User user = userService.findById(3);
        System.out.println(user);
    }
}