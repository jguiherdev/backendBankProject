package com.bank.bank.bankaccount;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountController {

    @Autowired
    BankAccountService bankAccountService;

    @RequestMapping(value="/bankaccounts")
    public List<BankAccount> getAllBankAccounts() {
        return bankAccountService.getAllBankAccounts();
    }

    @RequestMapping(value = "/bankaccounts/{id}")
    public BankAccount getUser(@PathVariable String id) {
    return bankAccountService.getBankAccount(id);
    }

    @RequestMapping(value = "/bankaccounts", method = RequestMethod.POST)
    public void addBankAccount(@RequestBody BankAccount bankAccount) {
        bankAccountService.addBankAccount(bankAccount);
    }

    @RequestMapping(value = "/bankaccounts/{id}", method = RequestMethod.DELETE)
    public void deleteBankAccount(@PathVariable String id) {
        bankAccountService.deleteBankAccount(id);
    }

    @RequestMapping(value = "/bankaccounts/{id}", method = RequestMethod.PUT)
    public void updateBankAccount(@RequestBody BankAccount bankAccount, @PathVariable String id) {
        bankAccountService.updateBankAccount(id, bankAccount);
    }

}

    
     
    

