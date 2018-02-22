package com.rolandoramirezx.barbershopserver.barbershopserver.dao;

import com.rolandoramirezx.barbershopserver.barbershopserver.entity.AppointmentCalendar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentCalendarDao extends JpaRepository <AppointmentCalendar, Long> {
}
