package com.example.NasaInterview;

import org.springframework.stereotype.Service;

@Service
public class AsteroidMapper {

    public Asteroid convert(com.example.NasaInterview.Model.Nasa.NearEarthObject nearEarthObject) {
        return null; //TODO
    }

    private ImpactType mapToImpactEnum(boolean isHazard, Double diameterInMetres) {
        return ImpactType.determineThreat(isHazard,diameterInMetres.intValue());
    }
}
