package com.rolandoramirezx.barbershopserver.barbershopserver.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data

public class Appointment implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Boolean booked;

    @ManyToOne
    @NotNull
    private Customer customer;

    @ManyToOne
    @NotNull
    private Barber barber;

    @ManyToOne
    @NotNull
    private AppointmentDay day;

    @NotNull
    @Future
    private Date startTime;

    @NotNull
    @Future
    private Date endTime;
}