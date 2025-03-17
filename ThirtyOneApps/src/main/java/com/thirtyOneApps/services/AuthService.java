package com.thirtyOneApps.services;

import com.thirtyOneApps.dtos.DriverDTO;
import com.thirtyOneApps.dtos.SignUpDTO;
import com.thirtyOneApps.dtos.UserDTO;

public interface AuthService {
    String login(String email, String password);

    UserDTO signUp(SignUpDTO signUpDTO);

    DriverDTO onboardNewDriver(Long userId);
}
