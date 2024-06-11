package com.vokye.vokyProject.ventemanagement.service;

import com.vokye.vokyProject.ventemanagement.model.Vente;
import com.vokye.vokyProject.ventemanagement.repository.VenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VenteService {

    @Autowired
    private VenteRepository venteRepository;

    public List<Vente> getAllVente() {
        return venteRepository.findAll();
    }

    public Optional<Vente> getVenteById(Integer idVente) {
        return venteRepository.findById(idVente);
    }

    public Vente createVente(Vente vente) {
        return venteRepository.save(vente);
    }

    public String deleteVEnte(Integer idVente) {
        venteRepository.deleteById(idVente);
        return "deleted succes";

    }

}
