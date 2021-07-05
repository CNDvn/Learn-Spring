package com.cndvn.springbootdiary;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class UserDto {

    @NotEmpty(message = "Thieu username")
    private String username;

    @Email(message = "Email khong hop le")
    private String email;

    @NotEmpty(message = "Thieu password")
    @Min(value = 8, message = "Password phai tu 8 ki tu tro len")
    private String password;
}
