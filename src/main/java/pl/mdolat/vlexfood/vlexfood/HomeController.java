package pl.mdolat.vlexfood.vlexfood;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/food")
public class HomeController {

@Autowired
Repository repository;

@Autowired
AuthService authService;

    @RequestMapping("")
    public String showMenu(Model model){
        Restaurant restaurant = repository.getRestaurant() != null ? repository.getRestaurant() : Restaurant.emptyRestaurant();
        model.addAttribute("restaurant", restaurant);
        return "menuPage";
    }

    @RequestMapping(value = "/restaurant")
    public String addRestaurant(Model model){
        model.addAttribute("restaurant", new Restaurant());
        return "addRestaurantForm";
    }

    @RequestMapping(value = "/restaurantConfirm")
    public String verifyRestaurant(@ModelAttribute("restaurant") Restaurant restaurant,
                                   @RequestParam("token") String token){

        if (authService.isAuth(token)){
            repository.setRestaurant(restaurant);
            return "redirect:/food";
        }

        return "addRestaurantForm";
    }


}
