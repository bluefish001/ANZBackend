package com.xieh.backend.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Account info
 */
@Entity
@Table(name="Account")
public class Account implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="Account_Number")
    private Long accNumber;

    @Column(name="Account_Name")
    private String accName;

    @Column(name="Account_Type")
    private String accType;

    @Column(name="Balance_Date")
    private LocalDate balanceDate;

    @Column(name="Currency")
    private String currency;

    @Column(name="Balance")
    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(Long accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public LocalDate getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(LocalDate balanceDate) {
        this.balanceDate = balanceDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Account account = (Account) o;

        if (id != null ? !id.equals(account.id) : account.id != null) {
            return false;
        }
        if (accNumber != null ? !accNumber.equals(account.accNumber) : account.accNumber != null) {
            return false;
        }
        if (accName != null ? !accName.equals(account.accName) : account.accName != null) {
            return false;
        }
        return accType != null ? accType.equals(account.accType) : account.accType == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (accNumber != null ? accNumber.hashCode() : 0);
        result = 31 * result + (accName != null ? accName.hashCode() : 0);
        result = 31 * result + (accType != null ? accType.hashCode() : 0);
        return result;
    }
}
