package com.rolandoramirezx.barbershopserver.barbershopserver.dao;

import com.rolandoramirezx.barbershopserver.barbershopserver.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDao extends JpaRepository <Appointment, Long> {
}
