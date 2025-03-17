package com.thirtyOneApps.entities;

import com.thirtyOneApps.entities.enums.PaymentMethods;
import com.thirtyOneApps.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "rideRequest")

public class RideRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point pickUpLocation;

    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point dropOfLocation;


    @CreationTimestamp
    private LocalDateTime requestedTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @Enumerated(EnumType.STRING)
    private PaymentMethods paymentMethods;

    @Enumerated(EnumType.STRING)
    private RideRequestStatus rideRequestStatus;








}
