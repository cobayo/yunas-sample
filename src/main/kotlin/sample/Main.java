package sample;

import yunas.ModelAndView;
import yunas.Yunas;

import java.util.HashMap;
import java.util.Map;


public class Main {


    public static void main(String[] args) {

        // Top Page (Return html with Thymeleaf)
        Yunas.get("/", context -> {
            Map<String,String> res = new HashMap<>();
            ModelAndView modelAndView = new ModelAndView(res,"index");
            return modelAndView;
        });

    }

}

