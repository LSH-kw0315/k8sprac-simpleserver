package org.example.k8s.domain.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Value("${custom.jwt.secretKey}")
    private String jwtSecretKey;


    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/jwtSecretKey")
    public String secretKey(){
        return jwtSecretKey;
    }
}
