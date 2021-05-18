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
        "astronomical",
        "lunar",
        "kilometers",
        "miles"
})

public class MissDistance {

    @JsonProperty("astronomical")
    private String astronomical;
    @JsonProperty("lunar")
    private String lunar;
    @JsonProperty("kilometers")
    private String kilometers;
    @JsonProperty("miles")
    private String miles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("astronomical")
    public String getAstronomical() {
        return astronomical;
    }

    @JsonProperty("astronomical")
    public void setAstronomical(String astronomical) {
        this.astronomical = astronomical;
    }

    @JsonProperty("lunar")
    public String getLunar() {
        return lunar;
    }

    @JsonProperty("lunar")
    public void setLunar(String lunar) {
        this.lunar = lunar;
    }

    @JsonProperty("kilometers")
    public String getKilometers() {
        return kilometers;
    }

    @JsonProperty("kilometers")
    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    @JsonProperty("miles")
    public String getMiles() {
        return miles;
    }

    @JsonProperty("miles")
    public void setMiles(String miles) {
        this.miles = miles;
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
