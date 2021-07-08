package cnd.com.bookmanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_order_detail")
public class OrderDetailEntity implements Serializable {

    @Id
    private Long idProduct;

    private String nameProduct;

    private Double price;

    @Id
    @ManyToOne
    private OrderEntity order;
}
