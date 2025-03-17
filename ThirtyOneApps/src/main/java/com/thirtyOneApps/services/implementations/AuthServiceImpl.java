package com.thirtyOneApps.services.implementations;

import com.thirtyOneApps.dtos.DriverDTO;
import com.thirtyOneApps.dtos.SignUpDTO;
import com.thirtyOneApps.dtos.UserDTO;
import com.thirtyOneApps.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signUp(SignUpDTO signUpDTO) {
        return null;
    }

    @Override
    public DriverDTO onboardNewDriver(Long userId) {
        return null;
    }
}
