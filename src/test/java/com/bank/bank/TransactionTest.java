package com.bank.bank;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bank.bank.transaction.Transaction;
import com.bank.bank.transaction.TransactionService;

@SpringBootTest
class TransactionTest {


	@Test
	void getAllTransactionsTest() {
		TransactionService transactionService = new TransactionService();
		transactionService.getAllTransactions();
		assertTrue(transactionService.getAllTransactions().size()==3);
	}

	@Test
	void getTransactionTest() {
		TransactionService transactionService = new TransactionService();
		transactionService.getTransaction("1");
		assertTrue(transactionService.getTransaction("1").getId().equals("1"));
	}

	@Test
	void addTransactionTest() {
		TransactionService transactionService = new TransactionService();
		transactionService.addTransaction(new Transaction(
				"4","4","3",400.0));
		assertTrue(transactionService.getAllTransactions().size()==4);
	}
	


}
