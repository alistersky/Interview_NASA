package com.example.NasaInterview;

import com.example.NasaInterview.Model.Nasa.EstimatedDiameter;
import com.example.NasaInterview.Model.Nasa.Kilometers;
import com.example.NasaInterview.Model.Nasa.NearEarthObject;
import com.example.NasaInterview.Service.Nasa.NearEarthObjectService;
import com.example.NasaInterview.controller.NasaController;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class NasaControllerTest {

    @MockBean
    NearEarthObjectService nearEarthObjectService;


    @Test
    void asteroid() throws IOException {

//        when(nearEarthObjectService.nearEarthObject("1234", "DEMO_KEY")).thenReturn(getPlanetKillerAsteroid());

//        NasaController nasaController =
        Assertions.assertEquals(1, 2);
    }

    @Test
    void asteroidList() throws IOException {

        Assertions.assertEquals(1,2);
    }

    @Test
    void areWeGoingToDieReturnsTrue() throws IOException {

        Assertions.assertTrue(false);
    }

    @Test
    void areWeGoingToDieReturnsFalse() throws IOException {

        Assertions.assertFalse(true);
    }

    private NearEarthObject getNearEarthPlanetKillerObject(){
        NearEarthObject nearEarthObject =  new NearEarthObject();
        nearEarthObject.setId("1234");
        nearEarthObject.setName("Test Asteroid");
        nearEarthObject.setIsPotentiallyHazardousAsteroid(true);
        EstimatedDiameter estimatedDiameter = new EstimatedDiameter();
//        estimatedDiameter.setKilometers();
//        nearEarthObject.setEstimatedDiameter(EstimatedDiameter);
        return null;
    }
}