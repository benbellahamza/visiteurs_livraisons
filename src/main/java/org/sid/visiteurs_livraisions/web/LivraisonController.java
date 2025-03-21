package org.sid.visiteurs_livraisions.web;

import org.sid.visiteurs_livraisions.dtos.LivraisonDTO;
import org.sid.visiteurs_livraisions.services.LivraisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livraisons")
public class LivraisonController {
    @Autowired
    private LivraisonService livraisonService;

    @PostMapping
    public LivraisonDTO createLivraison(@RequestBody LivraisonDTO livraisonDTO) {
        return livraisonService.createLivraison(livraisonDTO);
    }
}