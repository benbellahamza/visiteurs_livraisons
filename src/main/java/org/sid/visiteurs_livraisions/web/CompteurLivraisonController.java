package org.sid.visiteurs_livraisions.web;

import org.sid.visiteurs_livraisions.dtos.CompteurLivraisonDTO;
import org.sid.visiteurs_livraisions.services.CompteurLivraisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compteur-livraisons")
public class CompteurLivraisonController {
    @Autowired private CompteurLivraisonService service;
    @PostMapping public CompteurLivraisonDTO create(@RequestBody CompteurLivraisonDTO dto) { return service.create(dto); }
    @GetMapping public List<CompteurLivraisonDTO> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public CompteurLivraisonDTO get(@PathVariable Long id) { return service.get(id); }
    @PutMapping("/{id}") public CompteurLivraisonDTO update(@PathVariable Long id, @RequestBody CompteurLivraisonDTO dto) { return service.update(id, dto); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}
