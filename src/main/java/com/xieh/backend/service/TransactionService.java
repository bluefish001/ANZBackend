package com.xieh.backend.service;

import java.util.List;

import com.xieh.backend.entity.Transaction;

/**
 * transaction management
 */
public interface TransactionService {
    /**
     * get transaction by account number
     * @param accountNumber
     * @return
     */
    public List<Transaction>  getTransactionsByAccountNumber(Long accountNumber);
}
