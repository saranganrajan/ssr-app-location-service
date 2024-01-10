package com.saranganrajanapps.ssrapplocationservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize
@Getter
public class Location {
    @JsonProperty("id")
    String id;
    @JsonProperty("name")
    String name;
    @JsonProperty("code")
    String code;
    @JsonProperty("district")
    String district;
    @JsonProperty("state")
    String state;
    @JsonProperty("pinCode")
    String pinCode;
}
