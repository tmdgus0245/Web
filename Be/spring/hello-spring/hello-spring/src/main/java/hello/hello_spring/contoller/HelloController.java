package hello.hello_spring.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    public HelloController() {
    }

    @GetMapping({"hello"})
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
    }
}
