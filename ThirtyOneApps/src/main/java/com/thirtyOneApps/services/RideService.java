package com.thirtyOneApps.services;

import com.thirtyOneApps.dtos.RideRequestDTO;
import com.thirtyOneApps.entities.Driver;
import com.thirtyOneApps.entities.Ride;
import com.thirtyOneApps.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public interface RideService {

    Ride getRideById(Long rideId);

    void MatchWithDrivers(RideRequestDTO rideRequestDTO);

    Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllMyRides(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);
}
