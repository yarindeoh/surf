package server.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aohana
 */

@RestController
public class SurfController {

    @CrossOrigin
    @RequestMapping(value = "/surf", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> createTriangle() {

        return new ResponseEntity(new Surf("Ashdod", "4", "feet", "16", "mph"), HttpStatus.OK);

    }


}
