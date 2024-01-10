package com.saranganrajanapps.ssrapplocationservice.repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LocationEntity {
    String id;
    String code;
    String name;
    String district;
    String state;
    String pinCode;
    String stdCode;
}
