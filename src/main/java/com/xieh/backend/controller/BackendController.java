package com.xieh.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.xieh.backend.entity.Account;
import com.xieh.backend.entity.Transaction;
import com.xieh.backend.exception.ResourceNotFoundException;
import com.xieh.backend.service.AccountService;
import com.xieh.backend.service.TransactionService;

/**
 * Created by xieh on 11/10/2019.
 */
@RestController
public class BackendController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private TransactionService transactionService;

    /*
     * get all accounts
     */
    @GetMapping("/api/accounts")
    public List<Account> getAccounts() throws ResourceNotFoundException {
        List<Account> accounts = accountService.getAllAccount();
        if(accounts==null || accounts.size()==0){
            throw  new  ResourceNotFoundException("Can not found any account ");
        }
        return accounts;
    }

    @GetMapping("/api/transaction/{accNumber}")
    public List<Transaction> getTransactionsByAccNumber(@PathVariable(value = "accNumber") Long accNumber) throws ResourceNotFoundException{
        List<Transaction> transactions = transactionService.getTransactionsByAccountNumber(accNumber);
        if(transactions==null || transactions.size()==0){
            throw  new  ResourceNotFoundException("Can not found for this account Number :: " + accNumber);
        }
        return transactions;
    }
}
