package pl.mdolat.vlexfood.vlexfood;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Repository {

    private Restaurant restaurant;

    private Map<String, String> orders = new HashMap<>();


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
}
