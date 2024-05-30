package com.iflix.iflix.Service;

import com.iflix.iflix.DTO.Request.AuthenticationRequest;
import com.iflix.iflix.DTO.Request.IntrospectRequest;
import com.iflix.iflix.DTO.Request.LogoutRequest;
import com.iflix.iflix.DTO.Response.AuthenticationResponse;
import com.iflix.iflix.DTO.Response.IntrospectResponse;
import com.iflix.iflix.Entities.Users;
import com.nimbusds.jose.JOSEException;

import java.text.ParseException;

public interface AuthenticationService {

    //verify token
    IntrospectResponse introspect(IntrospectRequest request) throws JOSEException, ParseException;

    //check username, password -> generate token
    AuthenticationResponse authenticate(AuthenticationRequest request);

    public String generateToken(Users user);

    public void logout(LogoutRequest request);
}
