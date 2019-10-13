package com.xieh.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xieh.backend.entity.Transaction;

/**
 * transaction info from db
 */
@Repository
public interface TransactionRepository  extends JpaRepository<Transaction,Long> {
    List<Transaction> findByAccNumber(Long accountNumber);
}
