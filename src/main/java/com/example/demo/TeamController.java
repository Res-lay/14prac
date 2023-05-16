package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/teams")
public class TeamController {
    Team team1 = new Team("Red", "1995");
    Team team2 = new Team("Black", "2010");
    Team team3 = new Team("White", "2001");
    private List<Map<String, String>> teamList = new ArrayList<Map<String, String>>(){{
        add(new HashMap<String, String>() {{put("firstname", team1.getName()); put("creationDate", team1.getCreationDate());}});
        add(new HashMap<String, String>() {{put("firstname", team2.getName()); put("creationDate", team2.getCreationDate());}});
        add(new HashMap<String, String>() {{put("firstname", team3.getName()); put("creationDate", team3.getCreationDate());}});
    }};

    @GetMapping
    @ResponseBody
    public List<Map<String, String>> listTeam(){
        return teamList;
    }

    @PostMapping
    @ResponseBody
    public Map<String, String> create(@RequestBody Map<String, String> message){
        System.out.println(message);
        teamList.add(message);
        return message;
    }

    @DeleteMapping
    @ResponseBody
    public void delete(@RequestBody Map<String, String> message){
        teamList.remove(message);
    }
}
