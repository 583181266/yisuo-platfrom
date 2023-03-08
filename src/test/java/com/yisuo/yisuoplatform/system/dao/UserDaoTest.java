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
        user.setIdCard("1234567899877654321");
        user.setEmail("446666@qq.com");
        user.setPhone("134566543333");
        user.setBirthday(new Date());
        user.setAge(18);
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