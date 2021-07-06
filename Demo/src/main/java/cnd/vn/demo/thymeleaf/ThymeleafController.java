package cnd.vn.demo.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    @GetMapping
    public String index(){
        return "thymeleaf/index";
    }

    @GetMapping("/profile")
    public String profifle(Model model) {
        //Tạo thông tin
        List<Info> profile= new ArrayList<>();
        profile.add(new Info("fullname", "Code Never Die"));
        profile.add(new Info("nickname", "CND"));
        profile.add(new Info("gmail", "cnd@gmail.com"));
        profile.add(new Info("facebook", "https://www.facebook.com/cnd"));
        profile.add(new Info("website", "no have"));

        //Đưa thông tin vào model
        model.addAttribute("loadProfile",profile);
        //Trả về template profile.html
        return "thymeleaf/profile";
    }
}
