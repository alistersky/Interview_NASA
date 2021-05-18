package com.example.NasaInterview;

import com.example.NasaInterview.Model.Nasa.NearEarthObject;
import com.example.NasaInterview.Model.Nasa.NearEarthObjectFeed;
import com.example.NasaInterview.Service.Nasa.NearEarthObjectService;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

@Service
public class NasaService {

    private final AsteroidMapper asteroidMapper;

    public NasaService(AsteroidMapper asteroidMapper) {
        this.asteroidMapper = asteroidMapper;
    }

    public String getNearEarthObjectIsHazard(String id) throws IOException {
        var retrofit = new Retrofit.Builder()
                .baseUrl("http://www.neowsapp.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        NearEarthObjectService service = retrofit.create(NearEarthObjectService.class);

        Response<NearEarthObject> response = service.nearEarthObject(id,"DEMO_KEY").execute();

        return response.body().getIsPotentiallyHazardousAsteroid().toString();
    }

    public Asteroid getNearEarthObject(String id) throws IOException {
        var retrofit = new Retrofit.Builder()
                .baseUrl("http://www.neowsapp.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        NearEarthObjectService service = retrofit.create(NearEarthObjectService.class);

        Response<NearEarthObject> response = service.nearEarthObject(id,"DEMO_KEY").execute();

        return asteroidMapper.convert(response.body());
    }

    public String getNearEarthObjectList(String startDate) throws IOException{
        var retrofit = new Retrofit.Builder()
                .baseUrl("http://www.neowsapp.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        NearEarthObjectService service = retrofit.create(NearEarthObjectService.class);

        Response<NearEarthObjectFeed> response = service.feed(startDate,"false","DEMO_KEY").execute();

        var objectMapper = new ObjectMapper();

        return objectMapper.writeValueAsString(response.body().getNearEarthObjects());
    }
}
