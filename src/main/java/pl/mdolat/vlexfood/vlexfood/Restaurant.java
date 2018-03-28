package pl.mdolat.vlexfood.vlexfood;

public class Restaurant {
    private String name;
    private String deliveryCost;
    private String url;

    public static Restaurant emptyRestaurant() {
        Restaurant restaurant = new Restaurant();
        restaurant.setName("BRAK");
        restaurant.setDeliveryCost("");
        restaurant.setUrl("");
        return restaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(String deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", deliveryCost='" + deliveryCost + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
