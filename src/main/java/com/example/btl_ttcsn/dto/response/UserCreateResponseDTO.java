package com.example.btl_ttcsn.dto.response;

import com.example.btl_ttcsn.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateResponseDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String name;
    private String gender;
    private int age;
    private String address;
    private Project project;
}
