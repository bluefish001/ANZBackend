package com.xieh.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xieh.backend.entity.Transaction;
import com.xieh.backend.repository.TransactionRepository;
import com.xieh.backend.service.TransactionService;

/**
 * Created by xieh on 11/10/2019.
 */
@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public List<Transaction> getTransactionsByAccountNumber(Long accountNumber){
        List<Transaction> transactions = transactionRepository.findByAccNumber(accountNumber);

        return  transactions;
    }

}
