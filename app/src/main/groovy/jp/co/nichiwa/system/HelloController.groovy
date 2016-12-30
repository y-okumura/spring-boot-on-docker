package jp.co.nichiwa.system

import org.springframework.web.bind.annotation.*

@RestController
class HelloController {
    @RequestMapping('/')
    String hello() {
        return 'Hello, world!!';
    }
}
