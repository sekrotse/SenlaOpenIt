package by.senla.openit.dtomapper;

import by.senla.openit.dtoentity.AbstractDto;
import by.senla.openit.entities.AbstractProjectEntity;

import java.util.List;

public interface DtoMapper<T extends AbstractDto, E extends AbstractProjectEntity> {

    List<T> listEntityToDto(List<E> entities);

    T entityToDto(E entity);
}

