package practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldSpringMVC {
@RequestMapping("/hellospring")
//@ResponseBody
    public String hellospring()
    {
       // return "Hello I am Spring Mvc";
        return "index";
    }
}
