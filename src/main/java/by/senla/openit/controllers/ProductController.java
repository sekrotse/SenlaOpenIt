package by.senla.openit.controllers;

import by.senla.openit.dtoentity.ProductDto;
import by.senla.openit.repository.servises.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/")
    public Long add(@RequestBody ProductDto productDto) {
        return productService.save(productDto);
    }

    @PutMapping("/")
    public void update(@RequestBody ProductDto productDto) {
        productService.save(productDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }




}
