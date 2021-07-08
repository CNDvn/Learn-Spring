package cnd.com.bookmanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tbl_account")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntity {

    @Id
    private String username;

    private String password;

    private String lastName;

    private String firstName;

    private Date dayOfBirth;

    private String avata;

    @ManyToOne
    private RoleEntity role;

    @ManyToOne
    private StatusEntity status;

    @OneToOne(mappedBy = "importBy")
    private ImportHistoryEntity importHistory;
}
