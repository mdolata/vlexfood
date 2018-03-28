package pl.mdolat.vlexfood.vlexfood;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Repository {

    private Restaurant restaurant;

    private Map<String, String> orders = new HashMap<>();

    private List<Opinion> opinions = new ArrayList<>();


    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String addNewOrder(String name, String order) {
        return orders.putIfAbsent(name, order);
    }

    public Map<String, String> getOrders() {
        return orders;
    }

    public List<Opinion> getOpinions(){
        return opinions;
    }

    public void addOpinion(Opinion opinion){
        opinions.add(opinion);
    }
}
