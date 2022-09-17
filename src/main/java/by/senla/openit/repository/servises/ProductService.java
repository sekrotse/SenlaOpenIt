package by.senla.openit.repository.servises;

import by.senla.openit.dtoentity.ProductDto;

public interface ProductService {
    Long save(ProductDto productDto);

    void delete(Long id);

}
