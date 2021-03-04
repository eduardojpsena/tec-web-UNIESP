package br.com.tecweb.model.entity;
/**
 * @author eduardoSena
 *
 */

import lombok.Data;

@Data
public class Client {
	
	private Long id;
	
	private String name;
	
	private String email;
	
	private String phone;

	public Client(Long id, String name, String email, String phone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
}
