package org.profesorp.simplecrud.repository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.profesorp.simplecrud.Entity.PersonEntity;

import java.util.List;

@ApplicationScoped
public class PersonRepository {
    @Inject
    EntityManager entityManager;

    public List<PersonEntity> getAllPersons()
    {
        List<PersonEntity>  personas= entityManager.createQuery("select p from PersonEntity p ",PersonEntity.class).getResultList();
        return personas;
    }
    @Transactional
    public PersonEntity addPerson(PersonEntity personEntity)
    {
         entityManager.persist(personEntity);
         return personEntity;
    }
}
