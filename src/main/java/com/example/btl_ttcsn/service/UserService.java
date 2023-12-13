package com.example.btl_ttcsn.service;

import com.example.btl_ttcsn.dto.common.UserDetailDTO;
import com.example.btl_ttcsn.dto.request.UserCreateRequestDTO;
import com.example.btl_ttcsn.dto.response.UserCreateResponseDTO;
import com.example.btl_ttcsn.entity.User;

public interface UserService {
    UserCreateResponseDTO create(UserCreateRequestDTO userCreateRequestDTO);
    UserCreateResponseDTO update(UserDetailDTO userDetailDTO);
    void remove(Long id);
    String forgotPassword(String email);
    UserCreateResponseDTO getCurruntUser();
    UserDetailDTO getUserById(Long id);
    String updatePassword(String password);
    void Confirm(String email,String password);
}
