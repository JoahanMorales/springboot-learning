package dazv.joahan.springwebc1.controllers;

import dazv.joahan.springwebc1.models.User;
import dazv.joahan.springwebc1.models.dto.ParamDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.code}")
    private long code;

    @Value("${config.listOfValues}")
    private List<String> listOfValues;

    @Value("${config.name}")
    private String name;

    @Value("#{${config.valuesMap}}")
    private Map<String, Object> valuesMap;

    @Value("#{${config.valuesMap}.product}")
    private String product;

    @Value("#{${config.valuesMap}.price}")
    private Long price;

    @Autowired
    private Environment env;


    @Value("#{ '${config.listOfValues}'.toUpperCase().split(',')}")
    private List<String> listValue;


    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{producto}/{id}")
    public Map<String, Object> mixPathVariable(@PathVariable String producto, @PathVariable long id) {
        Map<String, Object> json = new HashMap<>();
        json.put("id", id);
        json.put("producto", producto);
        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        user.setName(user.getName().toUpperCase());
        return user;
    }

    @GetMapping ("/values")
    public Map<String, Object> values(@Value("${config.message}") String message){
        Map<String, Object> json = new HashMap<>();
        Long code2 = env.getProperty("config.code", Long.class);
        json.put("Name", name);
        json.put("Code", code);
        json.put("Message", message);
        json.put("Message2", env.getProperty("config.message", ""));
        json.put("Code2", code2);
        json.put("ListOfValues", listOfValues);
        json.put("ListOfValues2", listValue);
        json.put("ValuesMap", valuesMap);
        json.put("Product", product);
        json.put("Price", price);
        return json;
    }
}
