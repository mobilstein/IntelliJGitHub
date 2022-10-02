package com.example.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data

public class RequestUser {

    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "Email not be less than two characters")
    @Email
    private String email;

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, message ="Name not be less than two characters")
    private String name;

    @NotNull(message = "password cannot be null")
    @Size(min = 8, message = "Password must be equal or grater than 8 characters and less than characters")
    private String pwd;

}
