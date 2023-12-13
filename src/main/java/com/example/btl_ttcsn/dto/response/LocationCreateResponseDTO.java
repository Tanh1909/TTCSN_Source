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
public class LocationCreateResponseDTO {
    private Long id;
    private String name;
    private String address;
    private String status;
}
