package com.saranganrajanapps.ssrapplocationservice.repository.mapper;

import com.saranganrajanapps.ssrapplocationservice.domain.Location;
import com.saranganrajanapps.ssrapplocationservice.repository.LocationEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocationMapper {
    public Location getDto(LocationEntity entity) {
         return Location.builder()
                 .id(entity.getId())
                 .name(entity.getName())
                 .district(entity.getDistrict())
                 .state(entity.getState())
                 .pinCode(entity.getPinCode())
                 .stdCode(entity.getStdCode())
                 .build();
    }

    public List<Location> getDtos(List<LocationEntity> entityList) {
        List<Location> locations = new ArrayList<>();
        entityList.forEach(entity -> {
                  locations.add(Location.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .district(entity.getDistrict())
                    .state(entity.getState())
                          .pinCode(entity.getPinCode())
                          .stdCode(entity.getStdCode())
                    .build());
        });
         return locations;
    }
}
