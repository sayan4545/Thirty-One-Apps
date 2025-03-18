package com.thirtyOneApps.strategies;

import com.thirtyOneApps.dtos.RideRequestDTO;
import com.thirtyOneApps.entities.Driver;
import com.thirtyOneApps.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    public List<Driver> findMatchingDrivers(RideRequest rideRequest);
}
