package com.magasin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasin.models.Produit;
import com.magasin.repositories.ProduitRepository;

public class ProduitService implements GenericService<Produit>{

	@Autowired
	private ProduitRepository produit;
	
	@Override
	public List<Produit> getAll() {
		
		return this.produit.findAll();
	}

	@Override
	public Produit getById(Long id) {
		
		return this.produit.findById(id).get();
	}

	@Override
	public Produit save(Produit produit) {
		
		return this.produit.save(produit);
	}

	@Override
	public Produit update(Produit produit) {
		
		return this.produit.save(produit);
	}

	@Override
	public void deleteById(Long id) {
		
		this.produit.deleteById(id);
		
	}

}

