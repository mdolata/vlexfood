package pl.mdolat.vlexfood.vlexfood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class HomeController {

    @Autowired
    Repository repository;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("opinions", repository.getOpinions());
        return "home";
    }

    @RequestMapping("/opinion")
    public String opinionForm(Model model) {
        model.addAttribute("opinion", new Opinion());
        return "opinionForm";
    }

    @RequestMapping("/opinionConfirm")
    public String opinionFormConfirm(Model model,
            @ModelAttribute("opinion") Opinion opinion) {
        opinion.setDateIns(LocalDateTime.now().toString());
        repository.addOpinion(opinion);
        return "redirect:/";
    }

}
