package com.rolandoramirezx.barbershopserver.barbershopserver.rest;

import com.rolandoramirezx.barbershopserver.barbershopserver.dao.BarbershopDao;
import com.rolandoramirezx.barbershopserver.barbershopserver.entity.Barbershop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class BarbershopController {

    @Autowired
    private BarbershopDao barbershopDao;

    @RequestMapping(value = "/barbershop/new", method = POST)
    public Barbershop newBarberShop(@RequestParam(value = "name") String name) {

        Barbershop barberShop = new Barbershop();
        barberShop.setName(name);

        barbershopDao.save(barberShop);
        return barberShop;
    }
}
