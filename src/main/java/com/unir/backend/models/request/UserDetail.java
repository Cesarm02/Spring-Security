package com.unir.backend.models.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserDetail {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
