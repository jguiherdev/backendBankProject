package com.bank.bank.bankaccount;

public class BankAccount {

    public String id;
    public String userId;
    public String balance;

    public BankAccount(String id, String userId, String balance) {
        super();
        this.id = id;
        this.userId = userId;
        this.balance = balance;
    }

  
    public BankAccount() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    
    
}
