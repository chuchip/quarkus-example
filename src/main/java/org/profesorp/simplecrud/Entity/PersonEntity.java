package org.profesorp.simplecrud.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class PersonEntity {
    @Id
    @GeneratedValue
    private Long id;

    String name;
    private LocalDate birthDate;
}
