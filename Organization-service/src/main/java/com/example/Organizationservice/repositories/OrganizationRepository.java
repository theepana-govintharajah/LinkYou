package com.example.Organizationservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Organizationservice.models.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
    Organization findByName(String name);
}
