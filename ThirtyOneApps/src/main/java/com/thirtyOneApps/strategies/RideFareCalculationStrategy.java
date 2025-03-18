package com.thirtyOneApps.strategies;

import com.thirtyOneApps.dtos.RideRequestDTO;
import com.thirtyOneApps.entities.RideRequest;

public interface RideFareCalculationStrategy {

    public static final double RIDEFARE_MULTIPLIER = 9.8;

    public double calculateFare(RideRequest rideRequest);
}
