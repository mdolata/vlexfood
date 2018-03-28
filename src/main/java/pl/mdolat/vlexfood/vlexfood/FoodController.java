package pl.mdolat.vlexfood.vlexfood;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping(value = "/food")
public class FoodController {

@Autowired
Repository repository;

@Autowired
AuthService authService;

    @RequestMapping("")
    public String showMenu(Model model){
        Restaurant restaurant = repository.getRestaurant() != null ? repository.getRestaurant() : Restaurant.emptyRestaurant();
        model.addAttribute("restaurant", restaurant);

        Map<String, String> orders = repository.getOrders();
        model.addAttribute("orders", orders);
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

    @RequestMapping("/newOrder")
    public String addNewOrder(){
        return "newOrder";
    }

    @RequestMapping("/newOrderConfirm")
    public String addNewOrderConfirm(@RequestParam("name")String name,
                                     @RequestParam("orderDescription")String orderDescription){

        repository.addNewOrder(name,orderDescription);

        return "redirect:/food";
    }
}
