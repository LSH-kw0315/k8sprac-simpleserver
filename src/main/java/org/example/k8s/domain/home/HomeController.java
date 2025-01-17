package org.example.k8s.domain.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HomeController {
    @Value("${custom.jwt.secretKey}")
    private String jwtSecretKey;


    @GetMapping("/")
    public String showMain() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        // getHostName 메소드를 호출하여 호스트 이름을 얻습니다.
        String hostname = localHost.getHostName();
        return "home, hostname : " + hostname;
    }

    @GetMapping("/jwtSecretKey")
    public String secretKey(){
        return jwtSecretKey;
    }
}
