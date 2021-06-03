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

import com.magasin.models.Categorie;
import com.magasin.services.GenericService;

@RestController
@RequestMapping("categories")
public class CategorieController {

	@Autowired
	private GenericService<Categorie> service;
	
	@GetMapping()
	public List<Categorie> getCinemas() {
		return this.service.getAll();
	}
	
	@GetMapping("{id}")
	public Categorie getCinemaById(@PathVariable Long id) {
		return this.service.getById(id);
	}
	
	@PostMapping()
	public Categorie saveCinema(@RequestBody Categorie categorie) {
		return this.service.save(categorie);
	}
	
	@PatchMapping()
	public Categorie updateCinema(@RequestBody Categorie categorie) {
		return this.service.save(categorie);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		this.service.deleteById(id);
	}
}