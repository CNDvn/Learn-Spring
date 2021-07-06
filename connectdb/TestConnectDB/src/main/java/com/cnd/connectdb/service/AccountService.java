package com.cnd.connectdb.service;

import com.cnd.connectdb.entity.AccountEntity;
import com.cnd.connectdb.entity.StatusEntity;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface AccountService {
    public AccountEntity createAccount(AccountEntity accountEntity);
    public Set<AccountEntity> getStatus(String account);
}
