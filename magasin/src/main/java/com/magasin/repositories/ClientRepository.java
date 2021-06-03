package com.magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasin.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
