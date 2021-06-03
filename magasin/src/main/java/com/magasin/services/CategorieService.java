package com.magasin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasin.models.Categorie;
import com.magasin.repositories.CategorieRepository;

public class CategorieService implements GenericService<Categorie>{

	@Autowired
	private CategorieRepository categorie;
	
	@Override
	public List<Categorie> getAll() {
		
		return this.categorie.findAll();
	}

	@Override
	public Categorie getById(Long id) {
		
		return this.categorie.findById(id).get();
	}

	@Override
	public Categorie save(Categorie categorie) {
		
		return this.categorie.save(categorie);
	}

	@Override
	public Categorie update(Categorie categorie) {
		
		return this.categorie.save(categorie);
	}

	@Override
	public void deleteById(Long id) {
		
		this.categorie.deleteById(id);
		
	}

}

