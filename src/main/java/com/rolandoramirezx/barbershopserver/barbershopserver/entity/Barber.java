package com.rolandoramirezx.barbershopserver.barbershopserver.entity;


import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class Barber implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String name;

    @OneToMany
    private Set<Appointment> appointments;

    @OneToOne
    @NotNull
    private AppointmentCalendar appointmentCalendar;

}
