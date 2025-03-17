package com.thirtyOneApps.strategies.impl;

import com.thirtyOneApps.dtos.RideRequestDTO;
import com.thirtyOneApps.entities.Driver;
import com.thirtyOneApps.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatedDriverMatchingImpl implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDrivers(RideRequestDTO rideRequestDTO) {
        return List.of();
    }
}
