package com.squadio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author BasharOthman
 */
@Entity
@Table(name = "STATEMENTS")
public class Statement implements Serializable {

    @Id
    @JsonIgnore
    private String id;

    @Column(name = "account_id")
    @JsonIgnore
    private String accountId;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "amount")
    private String amount;

    @Column(name = "date_of_trs")
    private String date_of_trs;

    @Column(name = "currency")
    private String currency;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate_of_trs() {
        return date_of_trs;
    }

    public void setDate_of_trs(String date_of_trs) {
        this.date_of_trs = date_of_trs;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Statement{" + "id=" + id + ", accountId=" + accountId + ", description=" + description + ", amount=" + amount + ", date_of_trs=" + date_of_trs + ", currency=" + currency + '}';
    }

}
