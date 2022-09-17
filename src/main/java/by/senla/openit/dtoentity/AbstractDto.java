package by.senla.openit.dtoentity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Setter
@Getter
public abstract class AbstractDto {
    private Long id;
}

