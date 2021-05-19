package com.example.NasaInterview;

import com.example.NasaInterview.Model.Nasa.NearEarthObject;
import org.springframework.stereotype.Service;


@Service
public class AsteroidMapper {

    public Asteroid convert(NearEarthObject nearEarthObject) {

        return new Asteroid(nearEarthObject.getId(),
                nearEarthObject.getName(),
                Float.parseFloat(nearEarthObject.getCloseApproachData().get(0).getRelativeVelocity().getMilesPerHour()),
                Float.parseFloat(nearEarthObject.getCloseApproachData().get(0).getMissDistance().getMiles()),
                mapToImpactEnum(nearEarthObject.getIsPotentiallyHazardousAsteroid(),
                        nearEarthObject.getEstimatedDiameter().getMeters().getEstimatedDiameterMin()));
    }

    private ImpactType mapToImpactEnum(boolean isHazard, Double diameterInMetres) {
        return ImpactType.determineThreat(isHazard,diameterInMetres.intValue());
    }
}
