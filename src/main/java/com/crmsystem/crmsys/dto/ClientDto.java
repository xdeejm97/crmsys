package com.crmsystem.crmsys.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "You have to be between 3 - 50 signs")
    private String name;
    @NotNull
    private byte telephone;
    @NotBlank
    @Email(message = "Invalid email format")
    private String email;
    @NotNull
    private byte tin;

}
