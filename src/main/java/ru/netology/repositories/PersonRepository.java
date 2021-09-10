package ru.netology.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByAgeLessThanOrderByAge(int age);

    Optional<Person> findByNameAndSurname(String name, String surname);
}
