package com.xieh.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xieh.backend.entity.Account;

/**
 * Account info from db
 */
@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
}
