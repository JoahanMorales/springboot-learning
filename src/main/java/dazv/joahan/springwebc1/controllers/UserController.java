package dazv.joahan.springwebc1.controllers;

import dazv.joahan.springwebc1.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @GetMapping ( "/details" )
    public String details ( Model model ) {
        User user = new User ( "Joahan" , "Morales" , "joahanmoralesuwu@gmail.com" );
        model.addAttribute ( "title", "Hola mundo Spring" );
        model.addAttribute ( "user", user );
        return "details";
    }

    @GetMapping ( "/list" )
    public String list ( ModelMap modelMap ) {
        modelMap.addAttribute ( "title", "Lista de usuarios" );
        return "list";
    }

    @ModelAttribute ("users")
    public List<User> usersModel () {
        return Arrays.asList ( new User("Melanie", "Hernandez" , "miel@outlook.com" ),
                                new User("Joahan", "Morales" , "joahanmoralesuwu@gmail.com" ),
                                new User("Cassandra", "Morales" ) );

    }
}
