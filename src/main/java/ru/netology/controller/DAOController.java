package ru.netology.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.entity.Person;
import ru.netology.repository.DAORepository;

import java.util.List;

@RestController
public class DAOController {

    DAORepository daoRepository;

    public DAOController(DAORepository daoRepository) {
        this.daoRepository = daoRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return daoRepository.getPersonsByCity(city);
    }

}
