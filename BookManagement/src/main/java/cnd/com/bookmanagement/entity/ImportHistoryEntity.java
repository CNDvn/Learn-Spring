package cnd.com.bookmanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tbl_import_history")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImportHistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date importDate;

    private Integer quantity;

    @ManyToOne
    private ProductEntity product;

    @OneToOne
    @JoinColumn(name = "importBy", referencedColumnName = "username")
    private AccountEntity importBy;
}
