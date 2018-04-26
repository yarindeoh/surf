package server;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import server.rest.RestService;

/**
 * Created by aohana
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ServerApplication {

    public static void main(String[] args) {

        RestService.start(args);

    }

}
