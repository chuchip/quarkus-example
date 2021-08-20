package org.profesorp.simplecrud.resource;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.profesorp.simplecrud.dto.Fruit;

@Path("/fruit")
public class FruitResource
{

    @GET    
    public Fruit  getFruta() {
        Fruit f= new Fruit();
        f.setName("Manzana");
        f.setDescription("Manzana buena y rica");
        f.setFechaCaducidad(new Date());
        return f;
    }
    
    @POST    
    public Fruit addFruit(Fruit fruit)
    {
        System.out.println(fruit);
        return fruit;
    }
}