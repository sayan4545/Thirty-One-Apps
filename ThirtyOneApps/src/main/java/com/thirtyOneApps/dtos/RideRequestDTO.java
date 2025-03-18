package com.thirtyOneApps.dtos;

import com.thirtyOneApps.entities.Rider;
import com.thirtyOneApps.entities.enums.PaymentMethods;
import com.thirtyOneApps.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDTO {

    private Long id;


    private PointDTO pickUpLocation;


    private PointDTO dropOfLocation;



    private LocalDateTime requestedTime;


    private RiderDTO rider;


    private PaymentMethods paymentMethods;


    private RideRequestStatus rideRequestStatus;

    private Double fare;
}
