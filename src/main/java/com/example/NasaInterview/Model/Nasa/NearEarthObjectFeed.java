package com.example.NasaInterview.Model.Nasa;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "links",
        "element_count",
        "near_earth_objects",
})

public class NearEarthObjectFeed {
    @JsonProperty("links")
    private Links links;
    @JsonProperty("element_count")
    private int elementCount;
    @JsonProperty("near_earth_objects")
    private Map<String, List<NearEarthObject>> nearEarthObjects;

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("element_count")
    public int getElementCount() {
        return elementCount;
    }

    @JsonProperty("element_count")
    public void setElementCount(int elementCount) {
        this.elementCount = elementCount;
    }

    @JsonProperty("near_earth_objects")
    public Map<String, List<NearEarthObject>> getNearEarthObjects() {
        return nearEarthObjects;
    }

    @JsonProperty("near_earth_objects")
    public void setNearEarthObjects(Map<String, List<NearEarthObject>> nearEarthObjects) {
        this.nearEarthObjects = nearEarthObjects;
    }


}
