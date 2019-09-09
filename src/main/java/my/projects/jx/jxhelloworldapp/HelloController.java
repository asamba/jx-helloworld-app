package my.projects.jx.jxhelloworldapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by asamba on 9/9/19.
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World - from RestFul Service - from branch wip";
    }

}
