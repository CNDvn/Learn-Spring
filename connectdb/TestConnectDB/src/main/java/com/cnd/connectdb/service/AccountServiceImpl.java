package com.cnd.connectdb.service;

import com.cnd.connectdb.entity.AccountEntity;
import com.cnd.connectdb.entity.StatusEntity;
import com.cnd.connectdb.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountRepository accountRepository;

    @Override
    public AccountEntity createAccount(AccountEntity accountEntity) {
        System.out.println(accountRepository.count());
        return accountRepository.save(accountEntity);
    }
    @Override
    public Set<AccountEntity> getStatus(String account){
        return accountRepository.getStatus(account);
    }
}
