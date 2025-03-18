package com.thirtyOneApps.strategies.impl;

import com.thirtyOneApps.dtos.RideRequestDTO;
import com.thirtyOneApps.entities.RideRequest;
import com.thirtyOneApps.services.DistanceService;
import com.thirtyOneApps.strategies.RideFareCalculationStrategy;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class RideFareDefaultCalculateFareImpl implements RideFareCalculationStrategy {
    private final DistanceService distanceService;
    @Override
    public double calculateFare(RideRequest rideRequest) {
        Double distance = distanceService.calculateDistance(rideRequest.getPickUpLocation(),rideRequest.getDropOfLocation());
        return distance*RIDEFARE_MULTIPLIER;
    }
}
