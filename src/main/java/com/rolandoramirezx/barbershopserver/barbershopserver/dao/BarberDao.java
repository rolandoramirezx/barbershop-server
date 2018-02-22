package com.rolandoramirezx.barbershopserver.barbershopserver.dao;

import com.rolandoramirezx.barbershopserver.barbershopserver.entity.Barber;
import org.springframework.data.jpa.repository.JpaRepository;

//scanning type of first argument
//uses app. method to generate java class that implements this interface

public interface BarberDao extends JpaRepository <Barber, Long> {
}
