package com.saranganrajanapps.ssrapplocationservice.service;

import com.saranganrajanapps.ssrapplocationservice.domain.Location;
import com.saranganrajanapps.ssrapplocationservice.repository.LocationJpaRepository;
import com.saranganrajanapps.ssrapplocationservice.repository.mapper.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationManager implements LocationService {

    @Autowired
    LocationJpaRepository repository;

    @Autowired
    LocationMapper mapper;

    public LocationManager(LocationJpaRepository repository, LocationMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<Location> getLocations() {
        return mapper.getDtos(repository.getLocations());
    }
}
