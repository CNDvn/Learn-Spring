package cnd.com.bookmanagement.service.impl;

import cnd.com.bookmanagement.converter.ProductConverter;
import cnd.com.bookmanagement.entity.ProductEntity;
import cnd.com.bookmanagement.model.ProductDto;
import cnd.com.bookmanagement.repository.ProductRepository;
import cnd.com.bookmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductConverter productConverter;

    public List<ProductDto> getProducts() {

        List<ProductDto> products = new ArrayList<>();
        productRepository.findAll().stream().forEach(p -> products.add(productConverter.toProductDto(p)));

        return products;
    }

    @Override
    public ProductDto createProduct(ProductDto dto) {
        ProductEntity entity = productConverter.toProductEntity(dto);
        entity.setId(null);
        return productConverter.toProductDto(productRepository.save(entity));

    }
}
