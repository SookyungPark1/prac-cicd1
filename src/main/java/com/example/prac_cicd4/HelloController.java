package com.example.prac_cicd4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{

    @GetMapping("/hi")
    public  String  hi(){
        return  "hi cicd ^^   코드 수정 ec2 성능 업   chmod ^^ 박수경";
    }
}
