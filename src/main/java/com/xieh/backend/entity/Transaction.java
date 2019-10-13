package com.xieh.backend.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Transaction info
 */
@Entity
@Table(name="account_transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="Account_Number")
    private Long accNumber;

    @Column(name="Account_Name")
    private String accName;

    @Column(name="value_date")
    private LocalDate valueDate;

    @Column(name="Currency")
    private String currency;

    @Column(name="Debit_Amount")
    private BigDecimal debitAmount;

    @Column(name="Credit_Amount")
    private BigDecimal creditAmount;

    @Column(name="type")
    private String type;

    @Column(name="transaction_narrative")
    private String transactionNarrative;

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

    public LocalDate getValueDate() {
        return valueDate;
    }

    public void setValueDate(LocalDate valueDate) {
        this.valueDate = valueDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(BigDecimal debitAmount) {
        this.debitAmount = debitAmount;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransactionNarrative() {
        return transactionNarrative;
    }

    public void setTransactionNarrative(String transactionNarrative) {
        this.transactionNarrative = transactionNarrative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Transaction that = (Transaction) o;

        if (id != null ? !id.equals(that.id) : that.id != null) {
            return false;
        }
        if (accNumber != null ? !accNumber.equals(that.accNumber) : that.accNumber != null) {
            return false;
        }
        return accName != null ? accName.equals(that.accName) : that.accName == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (accNumber != null ? accNumber.hashCode() : 0);
        result = 31 * result + (accName != null ? accName.hashCode() : 0);
        return result;
    }
}
