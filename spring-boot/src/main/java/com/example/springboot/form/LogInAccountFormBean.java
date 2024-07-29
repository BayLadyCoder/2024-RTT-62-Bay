package com.example.springboot.form;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LogInAccountFormBean {
    private Integer id;

    @NotEmpty
    private String email;

    @NotEmpty
    private String password;
}
