package com.ggocodelab.ds_challenge_3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ggocodelab.ds_challenge_3.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
