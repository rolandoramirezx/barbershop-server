package com.rolandoramirezx.barbershopserver.barbershopserver.entity;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Data
public class AppointmentCalendar implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private Set<AppointmentMonth> months;

    @OneToOne
    @NotNull
    private Barber barber;
}
