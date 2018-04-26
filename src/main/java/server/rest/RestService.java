package server.rest;

import org.springframework.boot.SpringApplication;
import server.ServerApplication;

/**
 * Created by aohana
 */
public class RestService {

    public static void start(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
