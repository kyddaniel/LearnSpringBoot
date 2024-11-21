package com.kyddaniel.app.service;

import com.kyddaniel.app.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public void addLaptop(Laptop laptop) {
        System.out.println("added laptop");
    }
}
