package cnd.com.bookmanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date orderDate;

    private Double totalPrice;

    @OneToMany(mappedBy = "order")
    private Set<OrderDetailEntity> orders = new HashSet<>();

    @ManyToOne
    private StatusEntity status;
}
