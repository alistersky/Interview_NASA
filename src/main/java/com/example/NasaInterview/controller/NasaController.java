package com.example.NasaInterview.controller;

import com.example.NasaInterview.Asteroid;
import com.example.NasaInterview.ImpactType;
import com.example.NasaInterview.Model.Nasa.NearEarthObject;
import com.example.NasaInterview.Service.Nasa.NearEarthObjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

/**
 * Please provide the missing endpoint implementations
 */
@RestController
public class NasaController {

    private NearEarthObjectService nearEarthObjectService;
    private final String NASA_KEY = "DEMO_KEY";

    public NasaController(NearEarthObjectService nearEarthObjectService) {
        this.nearEarthObjectService = nearEarthObjectService;
    }

    /**
    * This endpoint will return a single Asteroid's details
    * @param  id The NASA NEO id
    * @return a single Asteroid object corresponding to the id
    */
    @GetMapping("/asteroid")
    public Asteroid neoHazards(@RequestParam(value = "id", defaultValue = "3709286") String id) throws IOException {
        Response<NearEarthObject> nearEarthObjectResponse = nearEarthObjectService.nearEarthObject(id, NASA_KEY).execute();

        assert nearEarthObjectResponse.body() != null;
        return new Asteroid(id, nearEarthObjectResponse.body().getName(), Float.parseFloat(nearEarthObjectResponse.body().getCloseApproachData().get(0).getRelativeVelocity().getMilesPerHour()),
                Float.parseFloat(nearEarthObjectResponse.body().getCloseApproachData().get(0).getMissDistance().getMiles()),
                ImpactType.determineThreat(nearEarthObjectResponse.body().getIsPotentiallyHazardousAsteroid(),
                        nearEarthObjectResponse.body().getEstimatedDiameter().getMeters().getEstimatedDiameterMax()));

    }

    /**
     * This endpoint will, given a start date return all asteroids that qualify as
     * Near Earth Objects (NEO) within 7 days
     * @param startDate a date as a string in format YYYY-MM-DD
     * @return a list of Asteroids
     * @throws IOException
     */
    @GetMapping("/asteroids")
    public List<Asteroid> neoList(@RequestParam(value = "startDate", defaultValue = "2021-05-08") String startDate) throws IOException {
        return null; // TODO
    }

    /**
     * This endpoint will, given a start date return true or false
     * if any Asteroids within 7 days are larger than ImpactType.LIFEKILLER
     * @param startDate
     * @return
     * @throws IOException
     */
    @GetMapping("/collision")
    public boolean areWeGoingToDie(@RequestParam(value = "startDate", defaultValue = "2021-05-08") String startDate) throws IOException {
        return false; // TODO
    }

}
