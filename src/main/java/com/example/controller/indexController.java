package com.example.controller;

import com.example.annotation.testAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: indexController
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月16日 11:20
 * @Version: 1.0
 **/
@RestController
public class indexController {
    @testAnnotation
    @GetMapping("/")
    String index()
    {
        System.out.println("zhengchang");
        return "success";
    }
}
