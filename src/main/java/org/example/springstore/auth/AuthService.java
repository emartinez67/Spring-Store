package org.example.springstore.auth;

import lombok.AllArgsConstructor;
import org.example.springstore.users.User;
import org.example.springstore.users.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService {
    private UserRepository userRepository;
    private AuthenticationManager authenticationManager;
    private JwtService jwtService;

    public User getCurrentUser() {
        var authentication = SecurityContextHolder.getContext().getAuthentication();
        var userId = (Long) authentication.getPrincipal();

        return userRepository.findById(userId).orElse(null);
    }

    public LoginResponse login(LoginRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(), request.getPassword()
                )
        );

        var user = userRepository.findByEmail(request.getEmail()).orElseThrow();

        var accessToken = jwtService.generateAccessToken(user);
        var refreshToken = jwtService.generateRefreshToken(user);

        return new LoginResponse(accessToken, refreshToken);
    }

    public Jwt refresh(String refreshToken) {
        var jwt = jwtService.parse(refreshToken);
        if (jwt == null || jwt.isExpired()) {
            throw new BadCredentialsException("Invalid refresh token");
        }

        var user = userRepository.findById(jwt.getUserId()).orElseThrow();

        return jwtService.generateAccessToken(user);
    }
}
