package com.thirtyOneApps.services.implementations;

import com.thirtyOneApps.dtos.DriverDTO;
import com.thirtyOneApps.dtos.RideDTO;
import com.thirtyOneApps.dtos.RideRequestDTO;
import com.thirtyOneApps.dtos.RiderDTO;
import com.thirtyOneApps.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {
        return null;
    }

    @Override
    public RideDTO cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDTO rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDTO getProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return List.of();
    }
}
