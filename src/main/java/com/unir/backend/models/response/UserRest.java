package com.unir.backend.models.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRest {

    private String firstName;
    private String lastName;
    private String email;
    private String userId;
}
