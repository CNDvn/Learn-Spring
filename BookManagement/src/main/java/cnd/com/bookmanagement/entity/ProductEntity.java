package cnd.com.bookmanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private Integer quantity;

    @OneToMany(mappedBy = "product")
    private Set<ImportHistoryEntity> history = new HashSet<>();

    @ManyToOne
    private StatusEntity status;
}
