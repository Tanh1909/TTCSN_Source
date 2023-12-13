package com.example.btl_ttcsn.service;

import com.example.btl_ttcsn.dto.request.LocationCreateRequestDTO;
import com.example.btl_ttcsn.dto.response.LocationCreateResponseDTO;

import java.util.List;

public interface LocationService {
    LocationCreateResponseDTO create(LocationCreateRequestDTO locationCreateRequestDTO);
    LocationCreateResponseDTO update(LocationCreateResponseDTO locationCreateResponseDTO);
    LocationCreateResponseDTO findById(Long id);
    LocationCreateResponseDTO addProject(Long idLocation,Long idProduct);
    void remove(Long id);
    List<LocationCreateResponseDTO> findAll();

}
