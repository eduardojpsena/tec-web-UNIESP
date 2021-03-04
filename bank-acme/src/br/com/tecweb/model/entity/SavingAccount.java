package br.com.tecweb.model.entity;
/**
 * @author eduardoSena
 *
 */

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class SavingAccount extends Account{
	
	private String operation;
	private Double income;
	
	public SavingAccount(Long id, String number, String agency, String operation, Client client, Double balance) {
		setId(id);
		setNumber(number);
		setAgency(agency);
		setClient(client);
		setBalance(balance);
		this.operation = operation;
	}
	
	public Double generateIncome () {
		income = getBalance() * 0.11/100;
		if (LocalDateTime.now().getDayOfMonth() == 01) {
			getTransactions().add(newTransaction(this, income, "Income"));
			this.setBalance(getBalance() + income);
			return getBalance();
		}
		return null;
	}
}
