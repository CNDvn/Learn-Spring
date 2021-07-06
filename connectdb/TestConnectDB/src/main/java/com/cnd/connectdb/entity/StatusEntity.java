package com.cnd.connectdb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "status")
@Getter
public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "status")
    @Setter private Set<AccountEntity> accountEntity = new HashSet<>();
}
