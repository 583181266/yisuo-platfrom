package com.yisuo.yisuoplatform.system.service;

import com.yisuo.yisuoplatform.system.entity.User;

public interface UserService extends BaseService<User>{
    void login(User user);
}
