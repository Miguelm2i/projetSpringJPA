package com.magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasin.models.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}