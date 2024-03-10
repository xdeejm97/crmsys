package com.crmsystem.crmsys.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @Email(message = "Invalid email format")
    private String email;
}
