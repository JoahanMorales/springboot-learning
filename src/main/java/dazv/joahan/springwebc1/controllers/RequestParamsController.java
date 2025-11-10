package dazv.joahan.springwebc1.controllers;

import dazv.joahan.springwebc1.models.dto.ParamDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping ("/foo")
    public ParamDto foo (@RequestParam(required = false, defaultValue = "Adios" , name = "mensaje") String message){
        ParamDto dto = new ParamDto();
        dto.setMessage(message);
        return dto;
    }

    @GetMapping ("/bar")
    public ParamDto bar (@RequestParam String text, @RequestParam Integer code){
        ParamDto dto = new ParamDto();
        dto.setMessage(text);
        dto.setCode(code);
        return dto;
    }

    @GetMapping ("/request")
    public ParamDto request (HttpServletRequest request ){
        ParamDto dto = new ParamDto();
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        dto.setCode(code);
        dto.setMessage(request.getParameter("text"));
        return dto;
    }
}
