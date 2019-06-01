package demo.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot Hello案例
 *
 * Created by bysocket on 26/09/2017.
 */
@RestController
public class HelloBookController {

    @RequestMapping(value = "/book/hello",method = RequestMethod.GET)
    public String sayHello() {
        System.out.println("测试");
        return "Hello，更改A1-0501";
    }
}
