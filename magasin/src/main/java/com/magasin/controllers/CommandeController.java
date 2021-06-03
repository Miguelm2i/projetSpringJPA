package com.magasin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magasin.models.Commande;
import com.magasin.services.CommandeService;

@RestController
@RequestMapping("commandes")
public class CommandeController {

	@Autowired
	private CommandeService service;
	
	@GetMapping()
	public List<Commande> getCommande() {
		return this.service.getAll();
	}
	
	@GetMapping("{id}")
	public Commande getCommandeById(@PathVariable Long id) {
		return this.service.getById(id);
	}
	
	@GetMapping("clients/{id}")
	public Iterable<Commande> findByClientId(@PathVariable Long id) {
		return this.service.getCommandeByUser(id);
	}
	
	@PostMapping()
	public Commande saveCommande(@RequestBody Commande commande) {
		return this.service.save(commande);
	}
	
	@PatchMapping()
	public Commande updateCommande(@RequestBody Commande commande) {
		return this.service.save(commande);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		this.service.deleteById(id);
	}
}