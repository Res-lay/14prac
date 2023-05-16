package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/footballers")
public class FootballerController {
    Footballer footballer1 = new Footballer("David", "Everdeen");
    Footballer footballer2 = new Footballer("Donald", "Stone");
    Footballer footballer3 = new Footballer("Mark", "Watson");
    public List<Map<String, String>> footballerList = new ArrayList<Map<String, String>>(){{
       add(new HashMap<String, String>() {{put("firstname", footballer1.getFirstName()); put("lastname", footballer1.getLastName());}});
       add(new HashMap<String, String>() {{put("firstname", footballer2.getFirstName()); put("lastname", footballer2.getLastName());}});
       add(new HashMap<String, String>() {{put("firstname", footballer3.getFirstName()); put("lastname", footballer3.getLastName());}});
    }};

    @GetMapping
    public List<Map<String, String>> list(){
        return footballerList;
    }

    @PostMapping
    public Map<String, String> create(@RequestBody Map<String, String> message){
        System.out.println(message);
        footballerList.add(message);
        return message;
    }

    @DeleteMapping
    public void delete(@RequestBody Map<String, String> message){
        footballerList.remove(message);
    }
}
