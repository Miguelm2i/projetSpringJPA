package com.magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasin.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}