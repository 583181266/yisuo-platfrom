package com.yisuo.yisuoplatform.system.dao;
import java.util.Date;
import java.util.Optional;

import com.yisuo.yisuoplatform.system.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserDaoTest {

    @Autowired
    private UserDao userDao;
    @Test
    void testInsert() {

        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456");
        user.setGender((short)0);
        user.setIdCard("11111112235453435443");
        user.setEmail("28377462487@qq.com");
        user.setPhone("12345324534");
        user.setBirthday(new Date());
        user.setStatus((short)0);
        user.setLastLogin(new Date());
        user.setCreateBy(0);
        user.setCreateTime(new Date());
        user.setUpdatedBy(0);
        user.setUpdatedTime(new Date());
        user.setIsDeleted((short)0);
        user.setRemark("test");

        User user1 = userDao.save(user);
        System.out.println(user1);

    }

    @Test
    void testGet() {
        Optional<User> user = userDao.findById(1);
        user.ifPresent(System.out::println);
    }

    @Test
    void testUpdate() {
        Optional<User> user = userDao.findById(1);
        user.ifPresent(u -> {
            u.setUsername("李四");
            User save = userDao.save(u);
            System.out.println(save);
        });
    }

    @Test
    void testDelete() {
        userDao.deleteById(1);
        Assertions.assertTrue(userDao.findById(1).isEmpty());
    }

    @Test
    void logicDeleteById() {
        userDao.logicDeletedById(2);
    }
}