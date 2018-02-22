package com.rolandoramirezx.barbershopserver.barbershopserver.dao;

import com.rolandoramirezx.barbershopserver.barbershopserver.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository <Customer, Long> {
}
