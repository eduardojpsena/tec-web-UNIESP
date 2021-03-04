package br.com.tecweb.view;
/**
 * @author eduardoSena
 *
 */

import br.com.tecweb.model.entity.Client;
import br.com.tecweb.model.entity.CurrentAccount;
import br.com.tecweb.model.entity.SavingAccount;

public class ManageAccount {

	public static void main(String[] args) {
				
		Client eduardo = new Client(1L, "Eduardo Sena", "eduardosena@gmail.com", "83 9 8888-9999");
		CurrentAccount accountEduardo = new CurrentAccount(1L, "001-0", "1234-5", eduardo, 0.0);
		SavingAccount savingEduardo = new SavingAccount(1L, "001-0", "1234-5", "013", eduardo, 0.0);
				
		accountEduardo.deposit(2000.00);
		accountEduardo.withdraw(500.00);
		accountEduardo.transfer(savingEduardo, 90.00);
		savingEduardo.generateIncome();
		accountEduardo.discountMaintenanceTax();
		
		System.out.println(accountEduardo.bankStatement());
		System.out.println(savingEduardo.bankStatement());
		
	}	
}
