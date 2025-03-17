package com.thirtyOneApps.services;

import com.thirtyOneApps.dtos.DriverDTO;
import com.thirtyOneApps.dtos.RideDTO;
import com.thirtyOneApps.dtos.RiderDTO;

import java.util.List;

public interface DriverService {

    public RideDTO acceptRide(Long rideId);

    public RideDTO cancelRide(Long rideId);

    public RideDTO startRide(Long rideId);

    public RideDTO endRide(Long rideId);

    public RiderDTO rateRider(Long rideId,Integer rating);

    public DriverDTO getProfile();

    public List<RideDTO> getAllMyRides();
}
