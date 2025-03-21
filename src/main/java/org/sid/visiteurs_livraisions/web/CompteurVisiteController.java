package org.sid.visiteurs_livraisions.web;

import org.sid.visiteurs_livraisions.dtos.CompteurVisiteDTO;
import org.sid.visiteurs_livraisions.services.CompteurVisiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compteur-visites")
public class CompteurVisiteController {
    @Autowired
    private CompteurVisiteService compteurVisiteService;

    @PostMapping
    public CompteurVisiteDTO createCompteurVisite(@RequestBody CompteurVisiteDTO compteurVisiteDTO) {
        return compteurVisiteService.createCompteurVisite(compteurVisiteDTO);
    }
}
