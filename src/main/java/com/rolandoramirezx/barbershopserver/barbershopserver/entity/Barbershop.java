package com.rolandoramirezx.barbershopserver.barbershopserver.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Data
public class Barbershop implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Barber> barbers;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Customer> customers;

}
