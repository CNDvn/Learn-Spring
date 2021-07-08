package cnd.com.bookmanagement.service;

import cnd.com.bookmanagement.model.ProductDto;

import java.util.List;
import java.util.Set;

public interface ProductService {
    public List<ProductDto> getProducts();
    public ProductDto createProduct(ProductDto dto);
}
