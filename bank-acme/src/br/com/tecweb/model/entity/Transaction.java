package br.com.tecweb.model.entity;
/**
 * @author eduardoSena
 *
 */

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Transaction {
	
	private Account account;
	private String typeTransaction;
	private Double value;
	private LocalDateTime dateTimeTransaction;
	
}
