package com.thirtyOneApps.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointDTO {

    private double[] coordinates;
    private String type = "Point";

    public PointDTO(double[] coordinates) {
        this.coordinates = coordinates;
    }
}
