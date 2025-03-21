package org.sid.visiteurs_livraisions.web;

import org.sid.visiteurs_livraisions.dtos.CompteurLivraisonDTO;
import org.sid.visiteurs_livraisions.services.CompteurLivraisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compteur-livraisons")
public class CompteurLivraisonController {
    @Autowired
    private CompteurLivraisonService compteurLivraisonService;

    @PostMapping
    public CompteurLivraisonDTO createCompteurLivraison(@RequestBody CompteurLivraisonDTO compteurLivraisonDTO) {
        return compteurLivraisonService.createCompteurLivraison(compteurLivraisonDTO);
    }
}
