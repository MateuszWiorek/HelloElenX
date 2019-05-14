package com.wiorekmateusz.hello.Configuration;

import com.wiorekmateusz.hello.Service.HelloService;
import com.wiorekmateusz.hello.Service.HelloServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    HelloService service = new HelloServiceImpl();

    @RequestMapping("/hello")
    public String sayHelloWorld(){
        return service.sayHello();
    }


}
