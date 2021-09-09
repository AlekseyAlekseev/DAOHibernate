package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class DAORepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery(
                "select p from Person p where p.city_of_living = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
