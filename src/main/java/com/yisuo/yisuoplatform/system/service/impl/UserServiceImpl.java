package com.yisuo.yisuoplatform.system.service.impl;

import com.yisuo.yisuoplatform.system.dao.UserDao;
import com.yisuo.yisuoplatform.system.entity.User;
import com.yisuo.yisuoplatform.system.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author huangbentai
 * @date 2023/3/8 23:25
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements UserService {

    @Resource
    private AuthenticationManager authenticationManager;

    @Resource
    private BCryptPasswordEncoder encoder;

    @Override
    public void save(User entity) {
        entity.setPassword(encoder.encode(entity.getPassword()));
        super.save(entity);
    }

    @Override
    public void login(User user) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());
       authenticationManager.authenticate(token);
    }
}
