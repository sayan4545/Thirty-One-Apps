package com.thirtyOneApps.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {
    public double calculateDistance(Point src, Point destination);
}
