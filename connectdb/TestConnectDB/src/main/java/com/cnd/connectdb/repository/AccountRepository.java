package com.cnd.connectdb.repository;

import com.cnd.connectdb.entity.AccountEntity;
import com.cnd.connectdb.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

public interface AccountRepository extends JpaRepository<AccountEntity, String> {
    @Query("select a from AccountEntity a where a.username like %?1%")
    Set<AccountEntity> getStatus(String accountName);
}
