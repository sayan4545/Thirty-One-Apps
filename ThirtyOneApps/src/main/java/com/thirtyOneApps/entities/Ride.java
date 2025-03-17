package com.thirtyOneApps.entities;

import com.thirtyOneApps.entities.enums.PaymentMethods;
import com.thirtyOneApps.entities.enums.RideRequestStatus;
import com.thirtyOneApps.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "ride")
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point pickUpLocation;

    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point dropOfLocation;


    @CreationTimestamp
    private LocalDateTime createdTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;

    @Enumerated(EnumType.STRING)
    private PaymentMethods paymentMethods;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    private Double fare;

    private LocalDateTime startedAt;

    private LocalDateTime endedaAt;
}
