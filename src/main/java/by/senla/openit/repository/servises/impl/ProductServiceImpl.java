package by.senla.openit.repository.servises.impl;

import by.senla.openit.dtoentity.ProductDto;
import by.senla.openit.dtomapper.ProductDtoMapper;
import by.senla.openit.entities.Product;
import by.senla.openit.entities.Status;
import by.senla.openit.exception.IncorectStatusException;
import by.senla.openit.repository.ProductRepository;
import by.senla.openit.repository.servises.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
@PropertySource("classpath:constant.properties")
public class ProductServiceImpl implements ProductService {

    private final Environment env;
    private final ProductRepository productRepository;
    private final ProductDtoMapper productDtoMapper;

    @Override
    public Long save(ProductDto productDto) {
        log.info("Method save");
        return productRepository.save(productDtoMapper.dtoToEntity(productDto)).getId();

    }

    @Override
    public void delete(Long id) {
        log.info("Method delete");

        Product company = productRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException(env.getProperty("PRODUCT_NOT_EXIST_EXCEPTION"))
        );
        if(company.getStatus().equals(Status.IN_STOCK)||
                company.getStatus().equals(Status.RUNNING_LOW)) {
            throw new IncorectStatusException(env.getProperty("INCORRECT_STATUS_EXCEPTION"));
        }
        productRepository.delete(company);
    }
}
