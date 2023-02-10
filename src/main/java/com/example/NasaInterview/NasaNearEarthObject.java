package com.example.NasaInterview;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Get NASA API data and convert to Asteroid(s)
 * */
@Service
public class NasaNearEarthObject implements NearEarthObject{

    @Override
    public Asteroid getNearEarthObject(String id) throws IOException {
        return null; //TODO
    }

    @Override
    public List<Asteroid> getNearEarthObjectListToday() throws IOException {
        return null; //TODO
    }

    @Override
    public Boolean IsDangerousObjectImpactLikely(String startDate) throws IOException {
        return false; //TODO
    }
}
