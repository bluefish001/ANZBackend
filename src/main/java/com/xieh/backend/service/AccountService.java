package com.xieh.backend.service;

import java.util.List;

import com.xieh.backend.entity.Account;

/**
 * Account management
 */
public interface AccountService {

    /**
     * get all account
     * @return
     */
    public List<Account> getAllAccount();
}
