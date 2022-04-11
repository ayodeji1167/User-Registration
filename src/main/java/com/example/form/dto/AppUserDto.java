package com.example.form.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class AppUserDto implements Serializable {
    private String firstName;
    private String lastName;
    @Email
    @NotEmpty
    private String email;
    private String password;
    private String country;
    private String gender;
    private List<String> hobbies;
}
