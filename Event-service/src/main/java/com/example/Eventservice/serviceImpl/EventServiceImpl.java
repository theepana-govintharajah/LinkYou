package com.example.Eventservice.serviceImpl;

import com.example.Eventservice.dto.EventDTO;
import com.example.Eventservice.models.Event;
//import com.example.Eventservice.models.Organization;
import com.example.Eventservice.repositories.EventRepository;

import java.util.List;
import java.util.stream.Collectors;
//import com.example.Eventservice.repositories.OrganizationRepository;

public class EventServiceImpl {
    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
//    private final OrganizationRepository organizationRepository;

//    public EventServiceImpl(EventRepository eventRepository, OrganizationRepository organizationRepository) {
//        this.eventRepository = eventRepository;
//        this.organizationRepository = organizationRepository;
//    }

//    @Override
//    public EventDTO save(EventDTO eventDTO) {
//        // Check if the organization exists
//        //Organization organization = organizationRepository.findById(eventDTO.getOrganizationId()).orElseThrow(() -> new OrganizationNotFoundException("Organization not found"));
//        Event event = new Event();
//        event.setName(eventDTO.getName());
//        event.setVenue(eventDTO.getVenue());
//        event.setStartDate(eventDTO.getStartDate());
//        event.setEndDate(eventDTO.getEndDate());
//        event.setStartTime(eventDTO.getStartTime());
//        event.setEndTime(eventDTO.getEndTime());
//        //event.setOrganization(organization);
//        event = eventRepository.save(event);
//        eventDTO.setId(event.getId());
//        return eventDTO;
//    }


//    @Override
//    public EventDTO save(EventDTO eventDTO) {
//        Event event = new Event();
//        event.setName(eventDTO.getName());
//        event.setVenue(eventDTO.getVenue());
//        event.setStartDate(eventDTO.getStartDate());
//        event.setEndDate(eventDTO.getEndDate());
//        event.setStartTime(eventDTO.getStartTime());
//        event.setEndTime(eventDTO.getEndTime());
//
////        Organization organization = organizationRepository.findById(eventDTO.getOrganizationId()).orElseThrow(() -> new OrganizationNotFoundException("Organization with id " + eventDTO.getOrganizationId() + " not found"));
////        event.setOrganization(organization);
//
//        event = eventRepository.save(event);
//        eventDTO.setId(event.getId());
//        return eventDTO;
//    }

//    @Override
//    public List<EventDTO> findAll() {
//        List<Event> events = eventRepository.findAll();
//        return events.stream().map(event -> {
//            EventDTO eventDTO = new EventDTO();
//            eventDTO.setId(event.getId());
//            eventDTO.setName(event.getName());
//            eventDTO.setVenue(event.getVenue());
//            eventDTO.setStartDate(event.getStartDate());
//            eventDTO.setEndDate(event.getEndDate());
//            eventDTO.setStartTime(event.getStartTime());
//            eventDTO.setEndTime(event.getEndTime());
////            eventDTO.setOrganizationId(event.getOrganization().getId());
//            return eventDTO;
//        }).collect(Collectors.toList());
//    }
//
//    @Override
//    public EventDTO findById(Integer id) {
////        Event event = eventRepository.findById(id).orElseThrow(() -> new EventNotFoundException("Event not found"));
//        Event event = eventRepository.findById(id)
//        EventDTO eventDTO = new EventDTO();
//        eventDTO.setId(event.getId());
//        eventDTO.setName(event.getName());
//        eventDTO.setVenue(event.getVenue());
//        eventDTO.setStartDate(event.getStartDate());
//        eventDTO.setEndDate(event.getEndDate());
//        eventDTO.setStartTime(event.getStartTime());
//        eventDTO.setEndTime(event.getEndTime());
////        eventDTO.setOrganizationId(event.getOrganization().getId());
//        return eventDTO;
//    }
}
