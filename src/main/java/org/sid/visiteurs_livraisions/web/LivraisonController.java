package org.sid.visiteurs_livraisions.web;

import org.sid.visiteurs_livraisions.dtos.LivraisonDTO;
import org.sid.visiteurs_livraisions.services.LivraisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livraisons")
public class LivraisonController {
    @Autowired private LivraisonService service;
    @PostMapping public LivraisonDTO create(@RequestBody LivraisonDTO dto) { return service.create(dto); }
    @GetMapping public List<LivraisonDTO> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public LivraisonDTO get(@PathVariable Long id) { return service.get(id); }
    @PutMapping("/{id}") public LivraisonDTO update(@PathVariable Long id, @RequestBody LivraisonDTO dto) { return service.update(id, dto); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}
