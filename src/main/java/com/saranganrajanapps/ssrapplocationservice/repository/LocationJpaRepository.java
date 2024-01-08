package com.saranganrajanapps.ssrapplocationservice.repository;

import com.saranganrajanapps.ssrapplocationservice.domain.Location;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocationJpaRepository implements LocationRepository {
    @Override
    public List<LocationEntity> getLocations() {

        List<LocationEntity> locations = new ArrayList<>();

        LocationEntity location = LocationEntity.builder()
                .id("1001")
                .name("Udhagamandalam")
                .district("Nilgiris")
                .state("Tamilnadu")
                .pinCode("643001")
                .build();
        locations.add(location);

        location = LocationEntity.builder()
                .id("1002")
                .name("Hogenakkal")
                .district("Dharmapuri")
                .state("Tamilnadu")
                .pinCode("636704")
                .build();
        locations.add(location);

        location = LocationEntity.builder()
                .id("1003")
                .name("Kodaikanal")
                .district("Dindigul")
                .state("Tamilnadu")
                .pinCode("624104")
                .build();
        locations.add(location);

        return locations;
    }
}
