package com.thirtyOneApps.services;

import com.thirtyOneApps.dtos.DriverDTO;
import com.thirtyOneApps.dtos.RideDTO;
import com.thirtyOneApps.dtos.RideRequestDTO;
import com.thirtyOneApps.dtos.RiderDTO;

import java.util.List;

public interface RiderService {
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO);

    public RideDTO cancelRide(Long rideId);

    public DriverDTO rateDriver(Long rideId, Integer rating);

    public RiderDTO getProfile();

    public List<RideDTO> getAllMyRides();
}
