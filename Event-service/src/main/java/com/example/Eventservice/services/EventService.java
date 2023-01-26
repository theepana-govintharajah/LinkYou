package com.example.Eventservice.services;


import com.example.Eventservice.dto.EventDTO;

import java.util.List;

public interface EventService {

    EventDTO save(EventDTO eventDTO);

    List<EventDTO> findAll();

    EventDTO findById(Integer id);

    EventDTO findByName(String name);

    List<EventDTO> findByOrganizationId(Integer organizationId);
}

