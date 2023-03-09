package com.yisuo.yisuoplatform.system.controller;

import com.yisuo.yisuoplatform.system.entity.Result;
import com.yisuo.yisuoplatform.system.entity.User;
import com.yisuo.yisuoplatform.system.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author huangbentai
 * @date 2023/3/9 22:07
 */
@RestController
@RequestMapping("/api/v1/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    public Result<User> getById(@PathVariable Integer id){
        log.info("查询用户 id: {}",id);
        return Result.ok(userService.findById(id));
    }

    @PostMapping("/save")
    public Result<Void> save(@RequestBody User user){
        log.info("新增用户: {}",user);
        userService.save(user);
        return Result.ok();
    }

    @PutMapping("/update")
    public Result<Void> updateById(@RequestBody User user){
        log.info("修改用户: {}",user);
        userService.updateById(user);
        return Result.ok();
    }

    @DeleteMapping("/{id}")
    public Result<Void> deleteById(@PathVariable Integer id){
        log.info("删除用户: {}",id);
        userService.deleteById(id);
        return Result.ok();
    }



}
