package com.example.NasaInterview.Model.Nasa;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "next",
        "prev",
        "self"
})
public class Links {

    @JsonProperty("next")
    private String next;

    @JsonProperty("prev")
    @JsonAlias("previous")
    private String prev;
    @JsonProperty("self")
    private String self;

    @JsonProperty("next")
    public String getNext() {
        return next;
    }

    @JsonProperty("next")
    public void setNext(String next) {
        this.next = next;
    }

    @JsonProperty("prev")
    public String getPrev() {
        return prev;
    }

    @JsonProperty("prev")
    public void setPrev(String prev) {
        this.prev = prev;
    }

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }
}