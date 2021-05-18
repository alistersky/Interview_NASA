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
        "close_approach_date",
        "close_approach_date_full",
        "epoch_date_close_approach",
        "relative_velocity",
        "miss_distance",
        "orbiting_body"
})

public class CloseApproachDatum {

    @JsonProperty("close_approach_date")
    private String closeApproachDate;
    @JsonProperty("close_approach_date_full")
    private String closeApproachDateFull;
    @JsonProperty("epoch_date_close_approach")
    private Long epochDateCloseApproach;
    @JsonProperty("relative_velocity")
    private RelativeVelocity relativeVelocity;
    @JsonProperty("miss_distance")
    private MissDistance missDistance;
    @JsonProperty("orbiting_body")
    private String orbitingBody;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("close_approach_date")
    public String getCloseApproachDate() {
        return closeApproachDate;
    }

    @JsonProperty("close_approach_date")
    public void setCloseApproachDate(String closeApproachDate) {
        this.closeApproachDate = closeApproachDate;
    }

    @JsonProperty("close_approach_date_full")
    public String getCloseApproachDateFull() {
        return closeApproachDateFull;
    }

    @JsonProperty("close_approach_date_full")
    public void setCloseApproachDateFull(String closeApproachDateFull) {
        this.closeApproachDateFull = closeApproachDateFull;
    }

    @JsonProperty("epoch_date_close_approach")
    public Long getEpochDateCloseApproach() {
        return epochDateCloseApproach;
    }

    @JsonProperty("epoch_date_close_approach")
    public void setEpochDateCloseApproach(Long epochDateCloseApproach) {
        this.epochDateCloseApproach = epochDateCloseApproach;
    }

    @JsonProperty("relative_velocity")
    public RelativeVelocity getRelativeVelocity() {
        return relativeVelocity;
    }

    @JsonProperty("relative_velocity")
    public void setRelativeVelocity(RelativeVelocity relativeVelocity) {
        this.relativeVelocity = relativeVelocity;
    }

    @JsonProperty("miss_distance")
    public MissDistance getMissDistance() {
        return missDistance;
    }

    @JsonProperty("miss_distance")
    public void setMissDistance(MissDistance missDistance) {
        this.missDistance = missDistance;
    }

    @JsonProperty("orbiting_body")
    public String getOrbitingBody() {
        return orbitingBody;
    }

    @JsonProperty("orbiting_body")
    public void setOrbitingBody(String orbitingBody) {
        this.orbitingBody = orbitingBody;
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