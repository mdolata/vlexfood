package pl.mdolat.vlexfood.vlexfood;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Component
public class SaveToFile {
    public boolean saveNewRestaurant(Restaurant restaurant){

        Path path = Paths.get("logs\\restaurants");
        Path restaurants;
        try {
            List<String> strings = Files.readAllLines(path);
            strings.add(restaurant.toString());
            Files.write(path, strings);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }
}
