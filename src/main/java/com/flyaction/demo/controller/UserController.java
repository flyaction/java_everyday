package com.flyaction.demo.controller;


import com.flyaction.demo.annotation.LogAnnotation;
import com.flyaction.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @LogAnnotation("查看用户集合")
    @GetMapping("/list")
    public List<User> list(){
        return Arrays.asList(
                new User(1,"张三"),
                new User(2,"李四"),
                new User(3,"王五")
        );

    }

    @GetMapping("/getById/{id}")
    public User getById(@PathVariable("id") Integer id){
        return new User(1,"张三");
    }

    @LogAnnotation("添加用户")
    @GetMapping("/save")
    public boolean save(){
        return true;
    }

    @LogAnnotation("编辑用户")
    @GetMapping("/edit")
    public boolean edit(){
        return true;
    }

    @LogAnnotation("删除用户")
    @GetMapping("/del/{id}")
    public boolean del(@PathVariable("id") Integer id){
        return true;
    }



}
