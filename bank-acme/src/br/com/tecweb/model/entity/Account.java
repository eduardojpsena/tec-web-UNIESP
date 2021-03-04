package br.com.tecweb.model.entity;
/**
 * @author eduardoSena
 *
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;



@Data
public class Account {
	
	private Long id;
	private String number;
	private String agency;
	private Client client;
	private Double balance;
	private List<Transaction> transactions = new ArrayList<Transaction>();
	
		
	//Create a new transaction
	public Transaction newTransaction(Account account, Double value, String typeTransaction) {
		Transaction transaction = new Transaction();
		transaction.setAccount(account);
		transaction.setValue(value);
		transaction.setTypeTransaction(typeTransaction);
		transaction.setDateTimeTransaction(LocalDateTime.now());
		
		return transaction;
	}
	
	//Make an account deposit
	public Double deposit(Double value) {
				
		transactions.add(newTransaction(this, value, "Deposit"));
		
		return this.balance += value;
				
	}
	
	//Withdraw amount in account
	public Double withdraw(Double value) {
		
		if (this.balance >= value) {
			this.balance -= value;
		}
		
		transactions.add(newTransaction(this, value, "Withdraw"));

		return this.balance;
	}
	
	//Transfer amounts between accounts
	public Double transfer(Account targetAccount, Double value) {
				
		if (this.balance >= value) {
			this.balance -= value;
			targetAccount.deposit(value);
		}
		
		transactions.add(newTransaction(this, value, "Transfer"));

		return this.balance;
	}
	
	//List transactions
	public List<Transaction> listTransactions() {
		return transactions;
	}
	
	//Extract
	public String bankStatement() {
		String extract = "============= BANK STATMENT =============\n";
		for (Transaction transaction : transactions) {
			if (this.equals(transaction.getAccount())) {
				extract += "       Transaction type: " + transaction.getTypeTransaction() + "         \n" 
						+ "Transaction Amount: R$ " + transaction.getValue() + "\n" 
						+ "Transaction date: " + formateDate(transaction.getDateTimeTransaction()) + "\n" 
						+ "-----------------------------------------\n"; 
			}	
		}
		extract += "Balance: R$ " + this.balance + "\n";
		return extract;
	}
	
	//Date formatter
	private String formateDate(LocalDateTime date) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
		String dateNow = date.format(formatter);
		
		return dateNow;
	}

}
