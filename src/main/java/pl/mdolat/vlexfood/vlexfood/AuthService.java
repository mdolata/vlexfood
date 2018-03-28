package pl.mdolat.vlexfood.vlexfood;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthService {

    private final List<String> tokens;

    public AuthService() {
        this.tokens = new ArrayList<>();
        tokens.add("12345");

    }

    public Boolean isAuth(String token){
        return tokens.contains(token);
    }

}
