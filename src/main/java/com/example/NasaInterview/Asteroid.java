package com.example.NasaInterview;

public class Asteroid {

    private String nasaId;
    private String name;
    private Float milesPerHour;
    private Float missDistanceInMiles;
    private ImpactType impactType;

    public Asteroid() {
    }

    public Asteroid(String nasaId, String name, Float milesPerHour, Float missDistanceInMiles, ImpactType impactType) {
        this.nasaId = nasaId;
        this.name = name;
        this.milesPerHour = milesPerHour;
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

    public Float getMilesPerHour() {
        return milesPerHour;
    }

    public void setMilesPerHour(Float milesPerHour) {
        this.milesPerHour = milesPerHour;
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
