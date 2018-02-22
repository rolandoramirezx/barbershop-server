package com.rolandoramirezx.barbershopserver.barbershopserver.dao;

import com.rolandoramirezx.barbershopserver.barbershopserver.entity.Barbershop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarbershopDao extends JpaRepository <Barbershop, Long> {
}
