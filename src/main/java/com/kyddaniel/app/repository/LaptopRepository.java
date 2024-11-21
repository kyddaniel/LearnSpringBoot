package com.kyddaniel.app.repository;

import com.kyddaniel.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop) {
        System.out.println("save");
    }
}
