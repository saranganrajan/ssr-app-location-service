package com.saranganrajanapps.ssrapplocationservice.controller;

import com.saranganrajanapps.ssrapplocationservice.domain.Location;
import com.saranganrajanapps.ssrapplocationservice.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @Autowired
    LocationService locationService;

    @GetMapping("/locations")
    public ResponseEntity<List<Location>> getLocations() {
        return ResponseEntity.ok(locationService.getLocations());
    }
}
