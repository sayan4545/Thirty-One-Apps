package com.thirtyOneApps.services.implementations;

import com.thirtyOneApps.dtos.DriverDTO;
import com.thirtyOneApps.dtos.SignUpDTO;
import com.thirtyOneApps.dtos.UserDTO;
import com.thirtyOneApps.entities.Rider;
import com.thirtyOneApps.entities.User;
import com.thirtyOneApps.entities.enums.Roles;
import com.thirtyOneApps.repositories.UserRepository;
import com.thirtyOneApps.services.AuthService;
import com.thirtyOneApps.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final RiderService riderService;
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signUp(SignUpDTO signUpDTO) {
        User user = userRepository.findByEmail(signUpDTO.getEmail());
        if(user!=null){
            throw new RuntimeException("cant create, user already exists");
        }
        User mappedUser = modelMapper.map(signUpDTO, User.class);
        user.setUserRole(Set.of(Roles.RIDER));
        User savedUser = userRepository.save(user);

        riderService.createRider(savedUser);

        return null;
    }

    @Override
    public DriverDTO onboardNewDriver(Long userId) {
        return null;
    }
}
