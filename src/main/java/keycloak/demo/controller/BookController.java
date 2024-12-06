package keycloak.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/demo")
public class BookController {

    @GetMapping
    public String hello(){
        return "Hello from spring boot";
    }

    @GetMapping("/hello-2")
    public String hello2(){
        return "Hello from spring boot ADMIN";
    }
}
