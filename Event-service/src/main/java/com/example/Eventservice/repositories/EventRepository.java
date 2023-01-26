package com.example.Eventservice.repositories;

import com.example.Eventservice.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    Event findByName(String name);
//    List<Event> findByOrganizationId(Integer organizationId);
}

