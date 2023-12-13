package com.example.btl_ttcsn.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationCreateRequestDTO {
    private String name;
    private String address;
    private String status;
}
