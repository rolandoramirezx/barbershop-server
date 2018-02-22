package com.rolandoramirezx.barbershopserver.barbershopserver.dao;

import com.rolandoramirezx.barbershopserver.barbershopserver.entity.AppointmentDay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDayDao extends JpaRepository <AppointmentDay, Long> {
}
