package com.bank.bank.bankaccount;

public class BankAccount {

    public String id;
    public String userId;
    public Double balance;

    public BankAccount(String id, String userId, double balance) {
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    
    
}
