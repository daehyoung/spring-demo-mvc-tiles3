package com.mvmlabs.springboot.web; 
import org.springframework.web.bind.annotation.GetMapping; 

public class DefaultErrorController   {

    @GetMapping("/error")
    public String errorpage(){
        return "/error/error";
    }
}