package com.kyddaniel.app.service;

import com.kyddaniel.app.repository.LaptopRepository;
import com.kyddaniel.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptop) {
        System.out.println("added laptop");
        laptopRepository.save(laptop);
    }
}
