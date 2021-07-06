package com.cnd.connectdb.controller;

import com.cnd.connectdb.entity.AccountEntity;
import com.cnd.connectdb.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping
    public ResponseEntity getAccount(
        @RequestParam(value = "account", required = false, defaultValue = "") String account
    ){
        return ResponseEntity.ok(accountService.getStatus(account));
    }

    @PostMapping
    public ResponseEntity<AccountEntity> createAccount(@RequestBody AccountEntity account){

        AccountEntity accountEntity = accountService.createAccount(account);
        return ResponseEntity.ok(accountEntity);
    }
}
