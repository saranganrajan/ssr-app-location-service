package com.saranganrajanapps.ssrapplocationservice.repository;

import com.saranganrajanapps.ssrapplocationservice.domain.Location;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class LocationJpaRepository implements LocationRepository {
    @Override
    public List<LocationEntity> getLocations() {

        List<LocationEntity> locations = new ArrayList<>();

        LocationEntity location = LocationEntity.builder()
                .id("1001")
                .code(UUID.randomUUID().toString())
                .name("Udhagamandalam")
                .district("Nilgiris")
                .state("Tamilnadu")
                .pinCode("643001")
                .stdCode("04553")
                .build();
        locations.add(location);

        location = LocationEntity.builder()
                .id("1002")
                .code(UUID.randomUUID().toString())
                .name("Hogenakkal")
                .district("Dharmapuri")
                .state("Tamilnadu")
                .pinCode("636704")
                .stdCode("0553")
                .build();
        locations.add(location);

        location = LocationEntity.builder()
                .id("1003")
                .code(UUID.randomUUID().toString())
                .name("Kodaikanal")
                .district("Dindigul")
                .state("Tamilnadu")
                .pinCode("624104")
                .stdCode("0342")
                .build();
        locations.add(location);

        return locations;
    }
}
