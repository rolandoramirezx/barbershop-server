package com.rolandoramirezx.barbershopserver.barbershopserver.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Set;


@Entity
@Data
public class Barbershop implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private Set<Barber> barbers;
    @OneToMany
    private Set<Customer> customers;

}
