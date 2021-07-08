package cnd.com.bookmanagement.model;

import cnd.com.bookmanagement.entity.ImportHistoryEntity;
import cnd.com.bookmanagement.entity.StatusEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long id;

    private String name;

    private Double price;

    private Integer quantity;

    private Set<ImportHistoryEntity> history = new HashSet<>();

    private StatusEntity status;
}
