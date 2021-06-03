package com.magasin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasin.models.Commande;
import com.magasin.repositories.CommandeRepository;

public class CommandeService implements GenericService<Commande>{

	@Autowired
	private CommandeRepository commande;
	
	@Override
	public List<Commande> getAll() {
		
		return this.commande.findAll();
	}

	@Override
	public Commande getById(Long id) {
		
		return this.commande.findById(id).get();
	}
	
	public List<Commande> getCommandeByUser(Long id) {
		return this.commande.findByClientId(id);
	}

	@Override
	public Commande save(Commande commande) {
		
		return this.commande.save(commande);
	}

	@Override
	public Commande update(Commande commande) {
		
		return this.commande.save(commande);
	}

	@Override
	public void deleteById(Long id) {
		
		this.commande.deleteById(id);
		
	}

}

