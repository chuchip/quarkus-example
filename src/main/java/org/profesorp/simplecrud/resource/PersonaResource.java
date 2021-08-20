package org.profesorp.simplecrud.resource;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.profesorp.simplecrud.Entity.PersonEntity;
import org.profesorp.simplecrud.repository.PersonRepository;

import java.util.List;

@Path("/person")
public class PersonaResource {
    @Inject
    PersonRepository personRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PersonEntity> getAll() {
        return personRepository.getAllPersons();
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public PersonEntity  addPerson(PersonEntity personEntity) {
        System.out.println(personEntity.getName());
        return personRepository.addPerson(personEntity) ;
    }
}