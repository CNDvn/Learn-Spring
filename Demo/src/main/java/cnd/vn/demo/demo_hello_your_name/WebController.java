package cnd.vn.demo.demo_hello_your_name;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class WebController {
    @GetMapping
    public String index(){
        return "helloyourname/index";
    }

    @GetMapping("/about")
    public String about(){
        return "helloyourname/about";
    }

    @GetMapping("/hello")
    public String hello(
            @RequestParam(name = "name", required = false, defaultValue = "") String name,
            Model model
    ){
        model.addAttribute("name",name);
        return "helloyourname/hello";
    }
}
