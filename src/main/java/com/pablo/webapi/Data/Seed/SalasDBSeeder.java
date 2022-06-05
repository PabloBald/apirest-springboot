package com.pablo.webapi.Data.Seed;

import com.pablo.webapi.Data.Repositories.ISalaRepository;
import com.pablo.webapi.Domain.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SalasDBSeeder implements CommandLineRunner {

    @Autowired
    ISalaRepository salaRepository;

    @Override
    public void run(String... args) {
        seedSalas();
    }

    private void seedSalas(){
        if(salaRepository.count()==0) {
            Sala sala1 = new Sala();
            sala1.setCapacidad(5);

            Sala sala2 = new Sala();
            sala2.setCapacidad(10);

            Sala sala3 = new Sala();
            sala3.setCapacidad(35);

            salaRepository.save(sala1);
            salaRepository.save(sala2);
            salaRepository.save(sala3);
        }
    }
}
