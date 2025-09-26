package com.ToDoApplication.ToDoApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/Hello")
    public static String getuser()
    {
        return "This is ujjwal gupta";
    }

}
