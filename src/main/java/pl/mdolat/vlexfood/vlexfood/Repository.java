package pl.mdolat.vlexfood.vlexfood;

import org.springframework.stereotype.Component;

@Component
public class Repository {

    private Restaurant restaurant;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
