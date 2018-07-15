package mengfw.springboot.controller;

import mengfw.springboot.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private Student student;
    @RequestMapping("/hello")
    public String hello(){
        return student.sayHello() + " 123";
    }
}
