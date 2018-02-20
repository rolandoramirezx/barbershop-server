package com.rolandoramirezx.barbershopserver.barbershopserver.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.Set;

@Entity
@Data
public class AppointmentDay implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotNull
    private DayOfWeek day;

    @OneToMany
    private Set<Appointment> appointments;

    private static final int MAX_APPOINTMENTS_ALLOWED = 16;


}
