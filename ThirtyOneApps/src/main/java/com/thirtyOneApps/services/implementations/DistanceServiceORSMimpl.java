package com.thirtyOneApps.services.implementations;

import com.thirtyOneApps.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceORSMimpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point destination) {
        return 0;
    }
}
