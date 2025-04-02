package org.sid.visiteurs_livraisions.web;

import org.sid.visiteurs_livraisions.dtos.CompteurVisiteDTO;
import org.sid.visiteurs_livraisions.services.CompteurVisiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compteur-visites")
public class CompteurVisiteController {
    @Autowired private CompteurVisiteService service;
    @PostMapping public CompteurVisiteDTO create(@RequestBody CompteurVisiteDTO dto) { return service.create(dto); }
    @GetMapping public List<CompteurVisiteDTO> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public CompteurVisiteDTO get(@PathVariable Long id) { return service.get(id); }
    @PutMapping("/{id}") public CompteurVisiteDTO update(@PathVariable Long id, @RequestBody CompteurVisiteDTO dto) { return service.update(id, dto); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}
