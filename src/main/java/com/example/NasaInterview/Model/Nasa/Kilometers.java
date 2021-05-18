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
        "estimated_diameter_min",
        "estimated_diameter_max"
})

public class Kilometers {

    @JsonProperty("estimated_diameter_min")
    private Double estimatedDiameterMin;
    @JsonProperty("estimated_diameter_max")
    private Double estimatedDiameterMax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("estimated_diameter_min")
    public Double getEstimatedDiameterMin() {
        return estimatedDiameterMin;
    }

    @JsonProperty("estimated_diameter_min")
    public void setEstimatedDiameterMin(Double estimatedDiameterMin) {
        this.estimatedDiameterMin = estimatedDiameterMin;
    }

    @JsonProperty("estimated_diameter_max")
    public Double getEstimatedDiameterMax() {
        return estimatedDiameterMax;
    }

    @JsonProperty("estimated_diameter_max")
    public void setEstimatedDiameterMax(Double estimatedDiameterMax) {
        this.estimatedDiameterMax = estimatedDiameterMax;
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