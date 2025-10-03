package dazv.joahan.springwebc1.controllers;

import dazv.joahan.springwebc1.models.User;
import dazv.joahan.springwebc1.models.dto.UserDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping ( "api" )
public class UserRestController {

    @GetMapping ( "/details" )
    public UserDto details ( ) {
        UserDto userDto = new UserDto();
        User user = new User ( "Joahan" , "Morales" );
        userDto.setUser ( user );
        userDto.setTitle( "Hola mundo desde Spring Boot" );
        return userDto;
    }

    @GetMapping ( "/list" )
    public List < User > list ( ) {
        User user = new User ( "Joahan" , "Morales" );
        User user1 = new User ( "Melanie" , "Hernandez" );
        User user2 = new User ( "Cassandra" , "Morales" );

        return Arrays.asList ( user, user1, user2 );
    }

    @GetMapping ( "/details-map" )
    public Map<String, Object> detailsMap ( ) {
        User user = new User ( "Joahan" , "Morales" );
        Map < String , Object > body = new HashMap < > ( );

        body.put ( "title", "Hola mundo Spring" );
        body.put ( "user", user );
        return body;
    }
}
