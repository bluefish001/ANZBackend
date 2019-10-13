package com.xieh.backend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xieh.backend.entity.Account;
import com.xieh.backend.repository.AccountRepository;
import com.xieh.backend.service.AccountService;

/**
 * Created by xieh on 11/10/2019.
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllAccount(){
        List<Account> accounts =  accountRepository.findAll();
       /* Account a1 = new Account();
        a1.setAccName("t1");
        accounts.add(a1);

        Account a2 = new Account();
        a1.setAccName("t2");
        accounts.add(a2);

        Account a3 = new Account();
        a1.setAccName("t3");
        accounts.add(a3);*/

        return accounts;
    }
}
