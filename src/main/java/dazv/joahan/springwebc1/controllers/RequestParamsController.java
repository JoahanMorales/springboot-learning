package dazv.joahan.springwebc1.controllers;

import dazv.joahan.springwebc1.models.dto.ParamDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.tags.Param;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping ("/foo")
    public ParamDto foo (@RequestParam(required = false, defaultValue = "Adios" , name = "mensaje") String message){
        ParamDto dto = new ParamDto();
        dto.setMessage(message);
        return dto;
    }
}
