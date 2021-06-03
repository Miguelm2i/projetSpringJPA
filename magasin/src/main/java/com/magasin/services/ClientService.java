package com.magasin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasin.models.Client;
import com.magasin.repositories.ClientRepository;

public class ClientService implements GenericService<Client>{

	@Autowired
	private ClientRepository client;
	
	@Override
	public List<Client> getAll() {
		
		return this.client.findAll();
	}

	@Override
	public Client getById(Long id) {
		
		return this.client.findById(id).get();
	}

	@Override
	public Client save(Client client) {
		
		return this.client.save(client);
	}

	@Override
	public Client update(Client client) {
		
		return this.client.save(client);
	}

	@Override
	public void deleteById(Long id) {
		
		this.client.deleteById(id);
		
	}

}

