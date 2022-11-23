package com.bank.bank;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bank.bank.bankaccount.BankAccount;
import com.bank.bank.bankaccount.BankAccountService;
import com.bank.bank.transaction.TransactionService;

@SpringBootTest
class BankAccountTest {

	@Test
	void getAllBankAccountsTest() {
		BankAccountService bankAccountService = new BankAccountService();
		bankAccountService.getAllBankAccounts();
		assertTrue(bankAccountService.getAllBankAccounts().size()==3);
	}

	@Test
	void getBankAccountTest() {
		BankAccountService bankAccountService = new BankAccountService();
		bankAccountService.getBankAccount("1");
		assertTrue(bankAccountService.getBankAccount("1").getId().equals("1"));
	}

	@Test
	void addBankAccountTest() {
		BankAccountService bankAccountService = new BankAccountService();
		bankAccountService.addBankAccount(new BankAccount(
				"4","4",400.0));
		assertTrue(bankAccountService.getAllBankAccounts().size()==4);
	}

	@Test
	void deleteBankAccountTest() {
		BankAccountService bankAccountService = new BankAccountService();
		bankAccountService.deleteBankAccount("1");
		assertTrue(bankAccountService.getAllBankAccounts().size()==2);
	}

	@Test
	void updateBankAccountTest() {
		BankAccountService bankAccountService = new BankAccountService();
		bankAccountService.updateBankAccount("1", new BankAccount(
				"1","1",1000.0));
		assertTrue(bankAccountService.getBankAccount("1").getBalance().equals(1000.0));
	}

	
	@Test
	void updateBalanceTest() {
		TransactionService transactionService = new TransactionService();
		BankAccountService bankAccountService = new BankAccountService();
		bankAccountService.updateBalance(transactionService.getTransaction("1"));
		assertTrue(bankAccountService.getBankAccount("1").getBalance().equals(0.0));
		assertTrue(bankAccountService.getBankAccount("2").getBalance().equals(300.0));
	}



}
