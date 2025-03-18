package com.thirtyOneApps.services.implementations;

import com.thirtyOneApps.dtos.DriverDTO;
import com.thirtyOneApps.dtos.RideDTO;
import com.thirtyOneApps.dtos.RideRequestDTO;
import com.thirtyOneApps.dtos.RiderDTO;
import com.thirtyOneApps.entities.RideRequest;
import com.thirtyOneApps.services.RiderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {
        RideRequest rideRequest = modelMapper.map(rideRequestDTO,RideRequest.class);
        log.info(rideRequest.toString());
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
