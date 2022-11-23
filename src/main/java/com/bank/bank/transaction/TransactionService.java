package com.bank.bank.transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bank.bankaccount.BankAccountService;

@Service
public class TransactionService {

    @Autowired
    private BankAccountService bankAccountService;

    Transaction t1=new Transaction("1","1","2",100.0);
    Transaction t2=new Transaction("2","1","3",200.0);
    Transaction t3=new Transaction("3","2","3",300.0);

    List<Transaction> transactions = new ArrayList<Transaction>(Arrays.asList(t1, t2,t3));

    public List<Transaction> getAllTransactions() { 
        return transactions;
    }

    public Transaction getTransaction(String id) {
        Transaction transaction=transactions.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return transaction;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        bankAccountService.updateBalance(transaction);

    }

    
    
}
