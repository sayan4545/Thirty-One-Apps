package com.thirtyOneApps.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.DataOutput;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDTO {

    private UserDTO user;
    private Double rating;
}
