package com.thirtyOneApps.services.implementations;

import com.thirtyOneApps.dtos.DriverDTO;
import com.thirtyOneApps.dtos.RideDTO;
import com.thirtyOneApps.dtos.RideRequestDTO;
import com.thirtyOneApps.dtos.RiderDTO;
import com.thirtyOneApps.entities.Driver;
import com.thirtyOneApps.entities.Ride;
import com.thirtyOneApps.entities.enums.RideStatus;
import com.thirtyOneApps.services.RideService;
import com.thirtyOneApps.services.RiderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RideServiceImpl implements RideService {

    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void MatchWithDrivers(RideRequestDTO rideRequestDTO) {

    }

    @Override
    public Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllMyRides(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
