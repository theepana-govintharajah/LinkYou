package com.example.Eventservice.controllers;

import com.example.Eventservice.dto.EventDTO;
import com.example.Eventservice.services.EventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    private final Logger logger = LoggerFactory.getLogger(EventController.class);
//    private final EventService eventService;
//
//    public EventController(EventService eventService) {
//        this.eventService = eventService;
//    }
//
//    @PostMapping
//    public EventDTO save(@RequestBody EventDTO eventDTO) {
//        return eventService.save(eventDTO);
//    }
//
//    @GetMapping
//    public List<EventDTO> findAll() {
//        logger.debug("finding all events");
//        return eventService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public EventDTO findById(@PathVariable Integer id) {
//        return eventService.findById(id);
//    }
//
//    @GetMapping("/name/{name}")
//    public EventDTO findByName(@PathVariable String name) {
//        logger.debug("finding particular named event");
//        return eventService.findByName(name);
//    }
//
//    @GetMapping("/organization/{organizationId}")
//    public List<EventDTO> findByOrganizationId(@PathVariable Integer organizationId) {
//        logger.debug("finding events by organization id");
//        return eventService.findByOrganizationId(organizationId);
//    }
}
