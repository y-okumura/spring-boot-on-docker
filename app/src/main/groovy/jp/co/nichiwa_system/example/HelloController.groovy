package jp.co.nichiwa_system.example

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*

@RestController
class HelloController {

    @Autowired
    private ExampleMapper mapper;

    @RequestMapping('/')
    String hello() {
        return "Hello, world!!(${mapper.sysdate()})";
    }
}
