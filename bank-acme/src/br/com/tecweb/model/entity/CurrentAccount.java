package br.com.tecweb.model.entity;
/**
 * @author eduardoSena
 *
 */

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CurrentAccount extends Account{

	private Double maintenanceTax;
	
	public CurrentAccount(Long id, String number, String agency, Client client, Double balance) {
		setId(id);
		setNumber(number);
		setAgency(agency);
		setClient(client);
		setBalance(balance);
	}

	public Double discountMaintenanceTax () {
		maintenanceTax = 54.95;
		if (LocalDateTime.now().getDayOfMonth() == 04) {
			getTransactions().add(newTransaction(this, maintenanceTax, "Maintenance Tax"));
			this.setBalance(getBalance() - maintenanceTax);
			return getBalance();
		}
		return null;
	}
}
