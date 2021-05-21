package com.example.NasaInterview;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class NasaControllerTest {

    private NasaService mock = Mockito.mock(NasaService.class);
    private NasaController nasaController = new NasaController(mock);


    @Test
    void neoHazards() throws IOException {
        Asteroid returnedAstroid = new Asteroid() ;
        Mockito.when(mock.getNearEarthObject("1")).thenReturn(returnedAstroid);

        Asteroid asteroid = nasaController.asteroid("1");

        Assertions.assertEquals(asteroid, returnedAstroid);
    }

    @Test
    void neoList() throws IOException {
        Asteroid returnedAstroid = new Asteroid() ;
        Mockito.when(mock.getNearEarthObjectList("1")).thenReturn(Arrays.asList(returnedAstroid));

        List<Asteroid> asteroid = nasaController.asteroids("1");

        Assertions.assertEquals(asteroid,(Arrays.asList(returnedAstroid)));
    }

    @Test
    void areWeGoingToDieReturnsTrue() throws IOException {
        Asteroid returnedAstroid = new Asteroid() ;
        returnedAstroid.setImpactType(ImpactType.PLANETKILLER);

        Mockito.when(mock.getNearEarthObjectList("1")).thenReturn(Arrays.asList(returnedAstroid));

        boolean areWeGoingToDie = nasaController.areWeGoingToDie("1");

        Assertions.assertTrue(areWeGoingToDie);
    }

    @Test
    void areWeGoingToDieReturnsFalse() throws IOException {
        Asteroid returnedAstroid = new Asteroid() ;
        returnedAstroid.setImpactType(ImpactType.DUCK);

        Mockito.when(mock.getNearEarthObjectList("1")).thenReturn(Arrays.asList(returnedAstroid));

        boolean areWeGoingToDie = nasaController.areWeGoingToDie("1");

        Assertions.assertFalse(areWeGoingToDie);
    }
}