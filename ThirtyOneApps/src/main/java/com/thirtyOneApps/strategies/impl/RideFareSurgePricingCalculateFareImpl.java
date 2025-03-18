package com.thirtyOneApps.strategies.impl;

import com.thirtyOneApps.dtos.RideRequestDTO;
import com.thirtyOneApps.entities.RideRequest;
import com.thirtyOneApps.strategies.RideFareCalculationStrategy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class RideFareSurgePricingCalculateFareImpl implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
