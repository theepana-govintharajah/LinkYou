package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import models.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
    Organization findByName(String name);
}
