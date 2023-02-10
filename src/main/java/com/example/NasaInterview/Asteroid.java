package com.example.NasaInterview;

/**
 * READ ONLY - DO NOT MODIFY - our model of an NEO
 */
public class Asteroid {

    private String nasaId; // for simplicity this is the same as the Nasa NEO id
    private String name; // the same as the Nasa NEO name
    private Float velocityMilesPerHour;
    private Float missDistanceInMiles;
    private ImpactType impactType;

    public Asteroid() {
    }

    public Asteroid(String nasaId, String name, Float velocityMilesPerHour, Float missDistanceInMiles, ImpactType impactType) {
        this.nasaId = nasaId;
        this.name = name;
        this.velocityMilesPerHour = velocityMilesPerHour;
        this.missDistanceInMiles = missDistanceInMiles;
        this.impactType = impactType;
    }

    public String getNasaId() {
        return nasaId;
    }

    public void setNasaId(String nasaId) {
        this.nasaId = nasaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getVelocityMilesPerHour() {
        return velocityMilesPerHour;
    }

    public void setVelocityMilesPerHour(Float velocityMilesPerHour) {
        this.velocityMilesPerHour = velocityMilesPerHour;
    }

    public Float getMissDistanceInMiles() {
        return missDistanceInMiles;
    }

    public void setMissDistanceInMiles(Float missDistanceInMiles) {
        this.missDistanceInMiles = missDistanceInMiles;
    }

    public ImpactType getImpactType() {
        return impactType;
    }

    public void setImpactType(ImpactType impactType) {
        this.impactType = impactType;
    }
}
