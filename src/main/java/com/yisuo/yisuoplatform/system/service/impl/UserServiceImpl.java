package com.yisuo.yisuoplatform.system.service.impl;

import com.yisuo.yisuoplatform.system.dao.UserDao;
import com.yisuo.yisuoplatform.system.entity.User;
import com.yisuo.yisuoplatform.system.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author huangbentai
 * @date 2023/3/8 23:25
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements UserService {
}
