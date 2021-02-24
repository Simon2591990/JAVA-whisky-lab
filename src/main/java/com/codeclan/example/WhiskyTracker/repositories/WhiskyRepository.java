package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

    List<Whisky> findWhiskeyByYear(int year);

    List<Whisky> findWhiskeyByAge(int age);

    List<Whisky> findWhiskeyByDistilleryName(String distilleryName);

    List<Whisky> findWhiskeyByDistilleryRegion(String distilleryRegion);
}
