package com.example.NasaInterview;

import java.io.IOException;
import java.util.List;

/**
 * READ ONLY - DO NOT MODIFY
 */
public interface NearEarthObject {
    Asteroid getNearEarthObject(String id) throws IOException;

    List<Asteroid> getNearEarthObjectListToday() throws IOException;

    Boolean IsDangerousObjectImpactLikely(String startDate) throws IOException;
}
