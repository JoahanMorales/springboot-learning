package dazv.joahan.springwebc1.controllers;

import dazv.joahan.springwebc1.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class UserController {

    @GetMapping ( "/details" )
    public String details ( Model model ) {
        User user = new User ( "Joahan" , "Morales" );
        model.addAttribute ( "title", "Hola mundo Spring" );
        model.addAttribute ( "user", user );
        return "details";
    }
}
