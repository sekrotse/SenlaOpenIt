package by.senla.openit.dtomapper.impl;

import by.senla.openit.dtoentity.AbstractDto;
import by.senla.openit.dtomapper.DtoMapper;
import by.senla.openit.entities.AbstractProjectEntity;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractDtoMapper<T extends AbstractDto, E extends AbstractProjectEntity> implements DtoMapper<T, E> {

    public List<T> listEntityToDto(List<E> entities) {
        return entities.stream().map(this::entityToDto).collect(Collectors.toList());
    }
}

