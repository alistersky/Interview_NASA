package com.example.NasaInterview;

import com.example.NasaInterview.Service.Nasa.NearEarthObjectService;
import org.springframework.context.annotation.Bean;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * READ ONLY - DO NOT MODIFY - helper bean using Retrofit lib
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public NearEarthObjectService nearEarthObjectService(){
        var retrofit = new Retrofit.Builder()
                .baseUrl("http://www.neowsapp.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        return retrofit.create(NearEarthObjectService.class);
    }

}
