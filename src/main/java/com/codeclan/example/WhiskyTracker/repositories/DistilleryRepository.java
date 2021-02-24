package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface DistilleryRepository extends JpaRepository<Distillery, Long> {

    List<Distillery> findDistilleryByRegion(String region);

    List<Distillery>  findDistilleryByName(String name);

    List<Distillery> findByWhiskiesAge(int age);
}
