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
        "kilometers_per_second",
        "kilometers_per_hour",
        "miles_per_hour"
})

public class RelativeVelocity {
    @JsonProperty("kilometers_per_second")
    private String kilometersPerSecond;
    @JsonProperty("kilometers_per_hour")
    private String kilometersPerHour;
    @JsonProperty("miles_per_hour")
    private String milesPerHour;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("kilometers_per_second")
    public String getKilometersPerSecond() {
        return kilometersPerSecond;
    }

    @JsonProperty("kilometers_per_second")
    public void setKilometersPerSecond(String kilometersPerSecond) {
        this.kilometersPerSecond = kilometersPerSecond;
    }

    @JsonProperty("kilometers_per_hour")
    public String getKilometersPerHour() {
        return kilometersPerHour;
    }

    @JsonProperty("kilometers_per_hour")
    public void setKilometersPerHour(String kilometersPerHour) {
        this.kilometersPerHour = kilometersPerHour;
    }

    @JsonProperty("miles_per_hour")
    public String getMilesPerHour() {
        return milesPerHour;
    }

    @JsonProperty("miles_per_hour")
    public void setMilesPerHour(String milesPerHour) {
        this.milesPerHour = milesPerHour;
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
