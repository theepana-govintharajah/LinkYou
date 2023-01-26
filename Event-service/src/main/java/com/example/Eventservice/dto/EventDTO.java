package com.example.Eventservice.dto;

import lombok.Data;

import java.util.Date;

@Data

public class EventDTO {

    private Integer id;

    private String name;

    private String venue;

    private Date startDate;

    private Date endDate;

    private String startTime;

    private String endTime;

    private Integer organizationId;

    //getters and setters
}

