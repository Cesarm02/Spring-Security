package com.unir.backend.models.Dto;

import lombok.*;

import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class UserDto implements Serializable {

    private static final long SerialVersionUID = 1l;

    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptPassword;

}
