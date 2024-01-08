package com.saranganrajanapps.ssrapplocationservice.repository;

import com.saranganrajanapps.ssrapplocationservice.domain.Location;

import java.util.List;

public interface LocationRepository {
    List<LocationEntity> getLocations();
    
}
