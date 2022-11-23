package com.bank.bank.transaction;

public class Transaction {

    public String id;
    public String from;
    public String to;
    public String amount;

    public Transaction(String id, String from, String to, String amount) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public Transaction() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    
    
}
