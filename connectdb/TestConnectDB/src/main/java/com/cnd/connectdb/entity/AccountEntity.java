package com.cnd.connectdb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@Table(name = "account")
public class AccountEntity {

    @Id
    private String username;

    @Setter private String password;

    @ManyToMany
    @JoinTable(
            name = "account_status",
            joinColumns = @JoinColumn(name = "username"),
            inverseJoinColumns = @JoinColumn(name = "status_id")
    )
    @Setter private Set<StatusEntity> status = new HashSet<>();

}
