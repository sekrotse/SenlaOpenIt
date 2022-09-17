package by.senla.openit.dtomapper;

import by.senla.openit.dtoentity.ProductDto;
import by.senla.openit.entities.Product;

public interface ProductDtoMapper extends DtoMapper<ProductDto, Product> {

    Product dtoToEntity(ProductDto productDto);
}
