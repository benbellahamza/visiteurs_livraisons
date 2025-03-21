package org.sid.visiteurs_livraisions.web;

import org.sid.visiteurs_livraisions.dtos.VisiteurDTO;
import org.sid.visiteurs_livraisions.services.VisiteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visiteurs")
public class VisiteurController {
    @Autowired
    private VisiteurService visiteurService;

    @PostMapping
    public VisiteurDTO createVisiteur(@RequestBody VisiteurDTO visiteurDTO) {
        return visiteurService.createVisiteur(visiteurDTO);
    }
}
