package com.thirtyOneApps.strategies.impl;

import com.thirtyOneApps.dtos.RideRequestDTO;
import com.thirtyOneApps.entities.Driver;
import com.thirtyOneApps.entities.RideRequest;
import com.thirtyOneApps.strategies.DriverMatchingStrategy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
public class DriverMatchingNearestDriverMatchingImpl implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        return List.of();
    }
}
