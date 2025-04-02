package org.sid.visiteurs_livraisions.web;

import org.sid.visiteurs_livraisions.dtos.VisiteurDTO;
import org.sid.visiteurs_livraisions.services.VisiteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visiteurs")
public class VisiteurController {
    @Autowired private VisiteurService visiteurService;

    @PostMapping
    public VisiteurDTO create(@RequestBody VisiteurDTO dto) { return visiteurService.createVisiteur(dto); }
    @GetMapping public List<VisiteurDTO> getAll() { return visiteurService.getAllVisiteurs(); }
    @GetMapping("/{id}") public VisiteurDTO getOne(@PathVariable Long id) { return visiteurService.getVisiteurById(id); }
    @PutMapping("/{id}") public VisiteurDTO update(@PathVariable Long id, @RequestBody VisiteurDTO dto) { return visiteurService.updateVisiteur(id, dto); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { visiteurService.deleteVisiteur(id); }
}
