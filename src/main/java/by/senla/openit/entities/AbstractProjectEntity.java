package by.senla.openit.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class AbstractProjectEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
}

