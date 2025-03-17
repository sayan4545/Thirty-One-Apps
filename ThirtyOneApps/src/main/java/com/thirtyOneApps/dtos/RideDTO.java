package com.thirtyOneApps.dtos;

import com.thirtyOneApps.entities.Driver;
import com.thirtyOneApps.entities.Rider;
import com.thirtyOneApps.entities.enums.PaymentMethods;
import com.thirtyOneApps.entities.enums.RideStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDTO {

    private Long id;


    private Point pickUpLocation;


    private Point dropOfLocation;

    private LocalDateTime createdTime;


    private RiderDTO rider;


    private DriverDTO driver;


    private PaymentMethods paymentMethods;


    private RideStatus rideStatus;

    private Double fare;

    private LocalDateTime startedAt;

    private LocalDateTime endedaAt;
}
