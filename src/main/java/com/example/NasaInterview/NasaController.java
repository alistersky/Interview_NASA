package com.example.NasaInterview;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class NasaController {

    private final NasaService nasaService;

    public NasaController(NasaService nasaService) {
        this.nasaService = nasaService;
    }

    @GetMapping("/neo")
    public Asteroid neoHazards(@RequestParam(value = "id", defaultValue = "3709286") String id) throws IOException {
        return nasaService.getNearEarthObject(id);
    }

    @GetMapping("/neolist")
    public String neoList(@RequestParam(value = "startDate", defaultValue = "2021-05-08") String startDate) throws IOException {
        return nasaService.getNearEarthObjectList(startDate);
    }

    @GetMapping("/collision")
    public String areWeGoingToDie(){
        return "";
    }

}
