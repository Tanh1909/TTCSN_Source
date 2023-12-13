package com.example.btl_ttcsn.service;

import com.example.btl_ttcsn.dto.request.LoginRequestDTO;
import com.example.btl_ttcsn.dto.response.LoginResponseDTO;

public interface AuthService {
    LoginResponseDTO login(LoginRequestDTO request);
}
