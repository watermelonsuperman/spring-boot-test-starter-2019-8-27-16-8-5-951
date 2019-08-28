package com.oocl.web.sampleWebApp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
    @RequestMapping("/hello")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody String greetingBad() {
        return "Hello World";
    }
    @RequestMapping("/user")
    public @ResponseBody Map getName(){
    	Map user = new HashMap();
    	user.put("w", "y");
    	return user;
    }
    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)

    public @ResponseBody Map addId(@RequestBody HashMap map){
    	map.put("id", "0001");
    	return map;
    }
    
}
