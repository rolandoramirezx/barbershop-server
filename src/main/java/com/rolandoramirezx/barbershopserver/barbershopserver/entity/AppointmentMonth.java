package com.rolandoramirezx.barbershopserver.barbershopserver.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.Month;
import java.util.Set;


@Entity
@Data
public class AppointmentMonth implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Month month;

    @OneToMany
    private Set<AppointmentDay> week;

}
