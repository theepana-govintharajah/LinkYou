package com.example.Organizationservice.services;

import com.example.Organizationservice.dto.OrganizationDTO;

import java.util.List;

public interface OrganizationService {
    OrganizationDTO save(OrganizationDTO organization);
    List<OrganizationDTO> findAll();
    OrganizationDTO findById(Integer id);
    OrganizationDTO findByName(String name);
}

