package com.example.NasaInterview;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * Please provide the missing endpoint implementations
 * NOTE: all data to create an Asteroid is available
 * from the NASA NEO API
 */
@RestController
public class NasaController {

    /**
    * This endpoint will return a single Asteroid's details
    * @param  id The NASA NEO id
    * @return a single Asteroid object corresponding to the id
    */
    @GetMapping("/asteroid")
    public Asteroid asteroid(@RequestParam(value = "id", defaultValue = "3709286") String id) throws IOException {
        return null; //TODO
    }

    /**
     * This endpoint will, given a start date return all asteroids that qualify as
     * Near Earth Objects (NEO) within 7 days
     * @param startDate a date as a string in format YYYY-MM-DD
     * @return a list of Asteroids
     * @throws IOException
     */
    @GetMapping("/asteroids")
    public List<Asteroid> asteroids(@RequestParam(value = "startDate", defaultValue = "2023-02-10") String startDate) throws IOException {
        return null; //TODO
    }

    /**
     * This endpoint will, given a start date return true or false
     * if any Asteroids within 7 days are larger than ImpactType.LIFEKILLER
     * @param startDate
     * @return
     * @throws IOException
     */
    @GetMapping("/collision")
    public boolean areWeGoingToDie(@RequestParam(value = "startDate", defaultValue = "2023-02-10") String startDate) throws IOException {
        return false; //TODO
    }

}
