package com.xieh.backend.service;

import java.util.List;

import com.xieh.backend.entity.Transaction;

/**
 * Created by xieh on 11/10/2019.
 */
public interface TransactionService {
    public List<Transaction>  getTransactionsByAccountNumber(Long accountNumber);
}
