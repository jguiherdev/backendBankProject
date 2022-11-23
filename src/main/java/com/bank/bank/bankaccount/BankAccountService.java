package com.bank.bank.bankaccount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BankAccountService {

    BankAccount b1=new BankAccount("1","1",100.0);
    BankAccount b2=new BankAccount("2","2",200.0);
    BankAccount b3=new BankAccount("3","3",300);

    List<BankAccount> bankAccounts = new ArrayList<BankAccount>(Arrays.asList(b1, b2,b3)) ;

    public List<BankAccount> getAllBankAccounts() {
        return bankAccounts;
    }

    public BankAccount getBankAccount(String id) {
        BankAccount bankAccount=bankAccounts.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return bankAccount;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public void deleteBankAccount(String id) {
        bankAccounts.removeIf(t -> t.getId().equals(id));
 
    }

    public void updateBankAccount(String id, BankAccount bankAccount) {
        for (int i = 0; i < bankAccounts.size(); i++) {
            BankAccount b = bankAccounts.get(i);
            if (b.getId().equals(id)) {
                bankAccounts.set(i, bankAccount);
                return;
            }
        }
    }
  
    
}
