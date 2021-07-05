package com.cndvn.springbootdiary.controller;

import com.cndvn.springbootdiary.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    //cach 1
//    @PostMapping("/")
//    public ResponseEntity createUser (@RequestBody @Valid UserDto userDto, BindingResult bindResult){
//        if(bindResult.hasErrors()){
//            return ResponseEntity.badRequest().body("validation error");
//        }
//        return ResponseEntity.ok("hello");
//    }
    //cach 2 dung cach cau hinh exception
    @PostMapping("/")
    public ResponseEntity createUser(@RequestBody @Valid UserDto userDto) {
        return ResponseEntity.ok("hello");
    }
}
