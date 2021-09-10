package ru.netology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.entity.City;
import ru.netology.entity.Person;
import ru.netology.repositories.CityRepository;
import ru.netology.repositories.PersonRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class DAOController {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    PersonRepository personRepository;

    @GetMapping("cities/by-city")
    public List<City> getNamebyCity(@RequestParam("city") String city) {
        return cityRepository.findByName(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getPersonsByAge(@RequestParam("age") int age) {
        return personRepository.findByAgeLessThanOrderByAge(age);
    }

    @GetMapping("/persons/by-person")
    public Optional<Person> getPersonByNameAndSurname(@RequestParam("name") String name,
                                                      @RequestParam("surname") String surname) {
        return personRepository.findByNameAndSurname(name, surname);
    }
}
