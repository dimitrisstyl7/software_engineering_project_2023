package com.unipi.findoctor.services;

import com.unipi.findoctor.dto.DoctorDto;

import java.util.List;

public interface AdminService {
    public List<DoctorDto> findAllDoctors();
}
