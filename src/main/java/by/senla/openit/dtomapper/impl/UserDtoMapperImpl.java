package by.senla.openit.dtomapper.impl;

import by.senla.openit.dtoentity.UserDto;
import by.senla.openit.dtomapper.UserDtoMapper;
import by.senla.openit.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapperImpl extends AbstractDtoMapper<UserDto, User> implements UserDtoMapper {

    @Override
    public UserDto entityToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        return userDto;
    }
}

