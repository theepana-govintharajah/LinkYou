package com.example.Organizationservice.controllers;

//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import models.Organization;
//import services.OrganizationService;
//
//@RestController
//@RequestMapping("/organizations")
//public class OrganizationController {
//    @Autowired
//    private OrganizationService organizationService;
//
//    @GetMapping
//    public List<Organization> getAll() {
//        return organizationService.getAll();
//    }
//    @GetMapping("/{id}")
//    public Organization getById(@PathVariable Integer id) {
//        return organizationService.getById(id);
//    }
//
//    @GetMapping("/name/{name}")
//    public Organization getByName(@PathVariable String name) {
//        return organizationService.getByName(name);
//    }
//
//    @PostMapping
//    public Organization save(@RequestBody Organization organization) {
//        return organizationService.save(organization);
//    }
//}



// OrganizationController.java

import java.util.List;

import com.example.Organizationservice.dto.OrganizationDTO;
import org.springframework.web.bind.annotation.*;
import com.example.Organizationservice.services.OrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

    private final Logger logger = LoggerFactory.getLogger(OrganizationController.class);
    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @PostMapping
    public OrganizationDTO save(@RequestBody OrganizationDTO organizationDTO) {
        return organizationService.save(organizationDTO);
    }

    @GetMapping
    public List<OrganizationDTO> findAll() {

        logger.debug("finding all organizations");
        return organizationService.findAll();
    }

    @GetMapping("/{id}")
    public OrganizationDTO findById(@PathVariable Integer id) {
        return organizationService.findById(id);
    }

    @GetMapping("/name/{name}")
    public OrganizationDTO findByName(@PathVariable String name) {
        return organizationService.findByName(name);
    }
}

