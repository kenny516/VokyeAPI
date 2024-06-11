package com.vokye.vokyProject.ventemanagement.repository;

import com.vokye.vokyProject.ventemanagement.model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenteRepository extends JpaRepository<Vente,Integer> {
}
