package org.profesorp.simplecrud.dto;


import lombok.Data;
import java.util.Date;

@Data
public class Fruit {
    String name;
    String description;
    Date fechaCaducidad;
}
