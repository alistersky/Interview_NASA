package com.example.NasaInterview.Model.Nasa;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kilometers",
        "meters",
        "miles",
        "feet"
})

public class EstimatedDiameter {

    @JsonProperty("kilometers")
    private Kilometers kilometers;
    @JsonProperty("meters")
    private Meters meters;
    @JsonProperty("miles")
    private Miles miles;
    @JsonProperty("feet")
    private Feet feet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("kilometers")
    public Kilometers getKilometers() {
        return kilometers;
    }

    @JsonProperty("kilometers")
    public void setKilometers(Kilometers kilometers) {
        this.kilometers = kilometers;
    }

    @JsonProperty("meters")
    public Meters getMeters() {
        return meters;
    }

    @JsonProperty("meters")
    public void setMeters(Meters meters) {
        this.meters = meters;
    }

    @JsonProperty("miles")
    public Miles getMiles() {
        return miles;
    }

    @JsonProperty("miles")
    public void setMiles(Miles miles) {
        this.miles = miles;
    }

    @JsonProperty("feet")
    public Feet getFeet() {
        return feet;
    }

    @JsonProperty("feet")
    public void setFeet(Feet feet) {
        this.feet = feet;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
