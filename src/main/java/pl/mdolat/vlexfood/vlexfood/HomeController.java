package pl.mdolat.vlexfood.vlexfood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/opinion")
    public String opinionForm() {
        return "opinionForm";
    }

    @RequestMapping("/opinionConfirm")
    public String opinionFormConfirm() {
        return "home";
    }

}
