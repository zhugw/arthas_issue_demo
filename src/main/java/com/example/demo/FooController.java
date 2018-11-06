package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author zhuguowei
 * @date 11/6/18
 */
@RestController
public class FooController {
    @GetMapping("/foo")
    public Object foo(HttpServletRequest request, @RequestParam String name) {
        return "Hello " + name;
    }
}
