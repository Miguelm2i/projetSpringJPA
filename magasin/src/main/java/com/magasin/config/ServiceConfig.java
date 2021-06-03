package com.magasin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.magasin.models.Categorie;
import com.magasin.models.Client;
import com.magasin.models.Produit;
import com.magasin.services.CategorieService;
import com.magasin.services.ClientService;
import com.magasin.services.CommandeService;
import com.magasin.services.GenericService;
import com.magasin.services.ProduitService;

@Configuration
public class ServiceConfig {
	
	@Bean
	public GenericService<Categorie> CategorieServiceFactory() {
		return new CategorieService();
	}
	
	@Bean
	public GenericService<Client> ClientServiceFactory() {
		return new ClientService();
	}
	
	@Bean
	public CommandeService CommandeServiceFactory() {
		return new CommandeService();
	}
	
	@Bean
	public GenericService<Produit> ProduitServiceFactory() {
		return new ProduitService();
	}
}

