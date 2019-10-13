package com.xieh.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xieh.backend.entity.Account;

/**
 * Created by xieh on 11/10/2019.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
}
