package cnd.com.bookmanagement.converter;

import cnd.com.bookmanagement.entity.ProductEntity;
import cnd.com.bookmanagement.model.ProductDto;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {

    public ProductEntity toProductEntity(ProductDto dto) {
        ProductEntity entity = new ProductEntity(dto.getId(),
                dto.getName(),
                dto.getPrice(),
                dto.getQuantity(),
                dto.getHistory(),
                dto.getStatus());
        return entity;
    }

    public ProductDto toProductDto(ProductEntity entity) {
        ProductDto dto = new ProductDto(entity.getId(),
                entity.getName(),
                entity.getPrice(),
                entity.getQuantity(),
                entity.getHistory(),
                entity.getStatus());
        return dto;
    }
}
