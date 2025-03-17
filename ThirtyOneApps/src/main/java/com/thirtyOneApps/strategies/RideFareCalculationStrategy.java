package com.thirtyOneApps.strategies;

import com.thirtyOneApps.dtos.RideRequestDTO;

public interface RideFareCalculationStrategy {

    public double calculateFare(RideRequestDTO rideRequestDTO);
}
