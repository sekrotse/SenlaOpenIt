package by.senla.openit.dtomapper.impl;

import by.senla.openit.dtoentity.OrderDto;
import by.senla.openit.dtomapper.OrderDtoMapper;
import by.senla.openit.entities.Order;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
public class OrderDtoMapperImpl extends AbstractDtoMapper<OrderDto, Order> implements OrderDtoMapper {

    @Override
    public OrderDto entityToDto(Order order) {
        OrderDto orderDto = new OrderDto();
        orderDto.setId(order.getId());
        orderDto.setUserId(order.getUser().getId().toString());
        orderDto.setStatus(order.getStatus());
        orderDto.setCreatedAt(order.getCreatedAt());
        return orderDto;
    }
}

