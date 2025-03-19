package com.thirtyOneApps.controllers;

import com.thirtyOneApps.dtos.SignUpDTO;
import com.thirtyOneApps.dtos.UserDTO;
import com.thirtyOneApps.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    @PostMapping("signup")
    UserDTO signUp(@RequestBody SignUpDTO signUpDTO){
        return authService.signUp(signUpDTO);
    }

}
