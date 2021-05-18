package com.example.NasaInterview;

import com.example.NasaInterview.Model.Nasa.NearEarthObject;
import com.example.NasaInterview.Model.Nasa.NearEarthObjectFeed;
import com.example.NasaInterview.Service.Nasa.NearEarthObjectService;
import org.springframework.stereotype.Service;
import retrofit2.Response;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NasaService {

    private final AsteroidMapper asteroidMapper;
    private final NearEarthObjectService nearEarthObjectService;

    public NasaService(AsteroidMapper asteroidMapper, NearEarthObjectService nearEarthObjectService) {
        this.asteroidMapper = asteroidMapper;
        this.nearEarthObjectService = nearEarthObjectService;
    }

    public Asteroid getNearEarthObject(String id) throws IOException {

        Response<NearEarthObject> response = nearEarthObjectService.nearEarthObject(id,"DEMO_KEY").execute();







        return asteroidMapper.convert(response.body());
    }

    public List<Asteroid> getNearEarthObjectList(String startDate) throws IOException{

        Response<NearEarthObjectFeed> response = nearEarthObjectService.feed(startDate,"false","DEMO_KEY").execute();

        return response.body().getNearEarthObjects().values()
                .stream()
                .flatMap(Collection::stream)
                .map(asteroidMapper::convert)
                .collect(Collectors.toList());
    }
}
