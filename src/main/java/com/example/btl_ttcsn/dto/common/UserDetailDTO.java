package com.example.btl_ttcsn.dto.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailDTO {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String username;
    private String email;
}
