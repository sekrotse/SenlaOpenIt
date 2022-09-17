package by.senla.openit.dtomapper.impl;

import by.senla.openit.dtoentity.ProductDto;
import by.senla.openit.dtomapper.ProductDtoMapper;
import by.senla.openit.entities.Product;
import by.senla.openit.entities.Status;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

@Component
public class ProductDtoMapperImpl extends AbstractDtoMapper<ProductDto, Product> implements ProductDtoMapper {

    @Override
    public ProductDto entityToDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());
        productDto.setStatus(product.getStatus().name());
        return productDto;
    }

    @Override
    public Product dtoToEntity(ProductDto productDto) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        Status status = Collections.unmodifiableList(Arrays.asList(Status.values())).get(new Random().nextInt(Status.values().length));
        product.setStatus(status);
        return product;
    }
}

