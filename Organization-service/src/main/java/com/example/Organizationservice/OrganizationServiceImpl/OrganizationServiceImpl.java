package com.example.Organizationservice.OrganizationServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import com.example.Organizationservice.dto.OrganizationDTO;
import jakarta.persistence.EntityNotFoundException;
import com.example.Organizationservice.models.Organization;
import org.springframework.stereotype.Service;
import com.example.Organizationservice.repositories.OrganizationRepository;
import com.example.Organizationservice.services.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository organizationRepository;

    public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public OrganizationDTO save(OrganizationDTO organizationDTO) {
        Organization organization = new Organization();
        organization.setName(organizationDTO.getName());
        organization.setEmail(organizationDTO.getEmail());
        organization.setPhoneNumber(organizationDTO.getPhoneNumber());
        organization = organizationRepository.save(organization);
        organizationDTO.setId(organization.getId());
        return organizationDTO;
    }

    @Override
    public List<OrganizationDTO> findAll() {
        List<Organization> organizations = organizationRepository.findAll();
        return organizations.stream().map(organization -> {
            OrganizationDTO organizationDTO = new OrganizationDTO();
            organizationDTO.setId(organization.getId());
            organizationDTO.setName(organization.getName());
            organizationDTO.setEmail(organization.getEmail());
            organizationDTO.setPhoneNumber(organization.getPhoneNumber());
            return organizationDTO;
        }).collect(Collectors.toList());
    }

    @Override
    public OrganizationDTO findById(Integer id) {
        Organization organization = organizationRepository.findById(id).orElseThrow(()-> new EntityNotFoundException());
        OrganizationDTO organizationDTO = new OrganizationDTO();
        organizationDTO.setId(organization.getId());
        organizationDTO.setName(organization.getName());
        organizationDTO.setEmail(organization.getEmail());
        organizationDTO.setPhoneNumber(organization.getPhoneNumber());
        return organizationDTO;
    }


    @Override
    public OrganizationDTO findByName(String name) {
        Organization organization = organizationRepository.findByName(name);
        if (organization == null) {
            throw new OrganizationNotFoundException("Organization with name " + name + " not found.");
        }
        OrganizationDTO organizationDTO = new OrganizationDTO();
        organizationDTO.setId(organization.getId());
        organizationDTO.setName(organization.getName());
        organizationDTO.setEmail(organization.getEmail());
        organizationDTO.setPhoneNumber(organization.getPhoneNumber());
        return organizationDTO;
    }

}





