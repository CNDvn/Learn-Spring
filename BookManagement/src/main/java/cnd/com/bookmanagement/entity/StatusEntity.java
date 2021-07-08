package cnd.com.bookmanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_status")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "status")
    private Set<AccountEntity> accounts = new HashSet<>();

    @OneToMany(mappedBy = "status")
    private Set<OrderEntity> orders = new HashSet<>();

    @OneToMany(mappedBy = "status")
    private Set<ProductEntity> products = new HashSet<>();
}
