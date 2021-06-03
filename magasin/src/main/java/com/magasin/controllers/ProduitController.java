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

import com.magasin.models.Produit;
import com.magasin.services.GenericService;

@RestController
@RequestMapping("produits")
public class ProduitController {

	@Autowired
	private GenericService<Produit> service;
	
	@GetMapping()
	public List<Produit> getCinemas() {
		return this.service.getAll();
	}
	
	@GetMapping("{id}")
	public Produit getCinemaById(@PathVariable Long id) {
		return this.service.getById(id);
	}
	
	@PostMapping()
	public Produit saveCinema(@RequestBody Produit produit) {
		return this.service.save(produit);
	}
	
	@PatchMapping()
	public Produit updateCinema(@RequestBody Produit produit) {
		return this.service.save(produit);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		this.service.deleteById(id);
	}
}