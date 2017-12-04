package com.banny.SpringBootByMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Controller
public class App 
{
	
	@RequestMapping("/")
	@ResponseBody
	public String sayHello() {
		return "Hi Banny lalala bbbb cccc dddd";
	}
	
	public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
	
//	
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
}
