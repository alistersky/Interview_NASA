package com.example.NasaInterview;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class NasaControllerTest {

    private NasaNearEarthObject mock = Mockito.mock(NasaNearEarthObject.class);
    private NasaController nasaController = new NasaController(mock);


    @Test
    void neoHazard() throws IOException {
        Asteroid returnedAsteroid = new Asteroid();
        Mockito.when(mock.getNearEarthObject("1")).thenReturn(returnedAsteroid);

        Asteroid asteroid = nasaController.asteroid("1");

        Assertions.assertEquals(asteroid, returnedAsteroid);
    }

    @Test
    void neoListToday() throws IOException {
        Asteroid returnedAsteroid = new Asteroid();
        Mockito.when(mock.getNearEarthObjectListToday()).thenReturn(Arrays.asList(returnedAsteroid));

        List<Asteroid> asteroid = nasaController.asteroidsToday();

        Assertions.assertEquals(asteroid,(Arrays.asList(returnedAsteroid)));
    }

    @Test
    void areWeGoingToDieReturnsTrue() throws IOException {
        Asteroid returnedAsteroid = new Asteroid() ;
        returnedAsteroid.setImpactType(ImpactType.PLANETKILLER);

        Mockito.when(mock.IsDangerousObjectImpactLikely("1")).thenReturn(true);

        boolean areWeGoingToDie = nasaController.areWeGoingToDie("1");

        Assertions.assertTrue(areWeGoingToDie);
    }
}