package com.unir.backend.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unir.backend.models.request.UserLoginRequestModel;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@AllArgsConstructor
public class AuthenticationFIlter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;

    @Override
    public Authentication attemptAuthentication(
            HttpServletRequest request,
            HttpServletResponse response) throws AuthenticationException{
        try{
            UserLoginRequestModel userLoginRequestModel = new ObjectMapper().readValue(request.getInputStream(), UserLoginRequestModel.class);
            return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userLoginRequestModel.getEmail(), userLoginRequestModel.getPassword(), new ArrayList<>()));
        }catch(IOException exception){
            throw new RuntimeException(exception);
        }
    }


}
