package com.example.NasaInterview;

import java.io.IOException;
import java.util.List;

/**
 * READ ONLY - DO NOT MODIFY
 */
public interface NearEarthObject {
    Asteroid getNearEarthObject(String id) throws IOException;

    List<Asteroid> getNearEarthObjectListToday() throws IOException;

    List<Asteroid> getNearEarthObjectList(String startDate) throws IOException;
}
