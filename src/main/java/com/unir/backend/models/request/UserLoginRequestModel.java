package com.unir.backend.models.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class UserLoginRequestModel {
    private String email;
    private String password;

}
