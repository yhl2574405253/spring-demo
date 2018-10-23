package demo02.mvc.controller;

import demo02.mvc.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@TTT  自定义的注解
@Controller
public class MyController {

//	@Resource(name="myService")  可以根据类型装配，也可以根据名字装配，不推荐使用
    @Autowired
    MyService myService;

    public void service(String sql){
        System.out.println(myService.query(sql));
    }
}
