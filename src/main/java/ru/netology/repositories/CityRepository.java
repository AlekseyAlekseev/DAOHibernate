package ru.netology.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.entity.City;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {

    List<City> findByName(String name);



}
