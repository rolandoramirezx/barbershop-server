package com.rolandoramirezx.barbershopserver.barbershopserver.dao;

import com.rolandoramirezx.barbershopserver.barbershopserver.entity.AppointmentMonth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentMonthDao extends JpaRepository <AppointmentMonth, Long> {
}
