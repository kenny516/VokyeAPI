package com.vokye.vokyProject.controller;


import com.vokye.vokyProject.service.VenteService;
import com.vokye.vokyProject.model.Vente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vente")
public class VenteController {
    @Autowired
    private VenteService venteService;

    @GetMapping("read")
    public ResponseEntity<List<Vente>> getAllVentes() {
        List<Vente> ventes = venteService.getAllVente();
        return new ResponseEntity<>(ventes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vente> getUserById(@PathVariable Integer id) {
        Optional<Vente> vente = venteService.getVenteById(id);
        return vente.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Vente> createUser(@RequestBody Vente vente) {
        Vente venteCreated = venteService.createVente(vente);
        return new ResponseEntity<>(venteCreated, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
        String status =  venteService.deleteVEnte(id);
        return new ResponseEntity<>(status,HttpStatus.NO_CONTENT);
    }

}
