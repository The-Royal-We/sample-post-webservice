package com.example.getwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleGetController {

    @GetMapping("/dives")
    public String getListOfDiveSites() {
        return "site-1,site-2";
    }

    @GetMapping("/dives/{id}")
    public String getDiveSite(@PathVariable String id) {
        System.out.println(id);
        return "site-1";
    }
}







