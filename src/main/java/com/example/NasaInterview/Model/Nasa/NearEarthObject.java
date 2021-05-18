package com.example.NasaInterview.Model.Nasa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "neo_reference_id",
        "name",
        "nasa_jpl_url",
        "absolute_magnitude_h",
        "estimated_diameter",
        "is_potentially_hazardous_asteroid",
        "close_approach_data",
        "is_sentry_object"
})

public class NearEarthObject {

    @JsonProperty("id")
    private String id;
    @JsonProperty("neo_reference_id")
    private String neoReferenceId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nasa_jpl_url")
    private String nasaJplUrl;
    @JsonProperty("absolute_magnitude_h")
    private Double absoluteMagnitudeH;
    @JsonProperty("estimated_diameter")
    private EstimatedDiameter estimatedDiameter;
    @JsonProperty("is_potentially_hazardous_asteroid")
    private Boolean isPotentiallyHazardousAsteroid;
    @JsonProperty("close_approach_data")
    private List<CloseApproachDatum> closeApproachData = null;
    @JsonProperty("is_sentry_object")
    private Boolean isSentryObject;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("neo_reference_id")
    public String getNeoReferenceId() {
        return neoReferenceId;
    }

    @JsonProperty("neo_reference_id")
    public void setNeoReferenceId(String neoReferenceId) {
        this.neoReferenceId = neoReferenceId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nasa_jpl_url")
    public String getNasaJplUrl() {
        return nasaJplUrl;
    }

    @JsonProperty("nasa_jpl_url")
    public void setNasaJplUrl(String nasaJplUrl) {
        this.nasaJplUrl = nasaJplUrl;
    }

    @JsonProperty("absolute_magnitude_h")
    public Double getAbsoluteMagnitudeH() {
        return absoluteMagnitudeH;
    }

    @JsonProperty("absolute_magnitude_h")
    public void setAbsoluteMagnitudeH(Double absoluteMagnitudeH) {
        this.absoluteMagnitudeH = absoluteMagnitudeH;
    }

    @JsonProperty("estimated_diameter")
    public EstimatedDiameter getEstimatedDiameter() {
        return estimatedDiameter;
    }

    @JsonProperty("estimated_diameter")
    public void setEstimatedDiameter(EstimatedDiameter estimatedDiameter) {
        this.estimatedDiameter = estimatedDiameter;
    }

    @JsonProperty("is_potentially_hazardous_asteroid")
    public Boolean getIsPotentiallyHazardousAsteroid() {
        return isPotentiallyHazardousAsteroid;
    }

    @JsonProperty("is_potentially_hazardous_asteroid")
    public void setIsPotentiallyHazardousAsteroid(Boolean isPotentiallyHazardousAsteroid) {
        this.isPotentiallyHazardousAsteroid = isPotentiallyHazardousAsteroid;
    }

    @JsonProperty("close_approach_data")
    public List<CloseApproachDatum> getCloseApproachData() {
        return closeApproachData;
    }

    @JsonProperty("close_approach_data")
    public void setCloseApproachData(List<CloseApproachDatum> closeApproachData) {
        this.closeApproachData = closeApproachData;
    }

    @JsonProperty("is_sentry_object")
    public Boolean getIsSentryObject() {
        return isSentryObject;
    }

    @JsonProperty("is_sentry_object")
    public void setIsSentryObject(Boolean isSentryObject) {
        this.isSentryObject = isSentryObject;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "NearEarthObject{" +
                "id='" + id + '\'' +
                ", neoReferenceId='" + neoReferenceId + '\'' +
                ", name='" + name + '\'' +
                ", nasaJplUrl='" + nasaJplUrl + '\'' +
                ", absoluteMagnitudeH=" + absoluteMagnitudeH +
                ", estimatedDiameter=" + estimatedDiameter +
                ", isPotentiallyHazardousAsteroid=" + isPotentiallyHazardousAsteroid +
                ", closeApproachData=" + closeApproachData +
                ", isSentryObject=" + isSentryObject +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
