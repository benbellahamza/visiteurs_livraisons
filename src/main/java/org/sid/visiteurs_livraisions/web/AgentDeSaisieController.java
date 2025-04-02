package org.sid.visiteurs_livraisions.web;

import org.sid.visiteurs_livraisions.dtos.AgentDeSaisieDTO;
import org.sid.visiteurs_livraisions.services.AgentDeSaisieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/agents")
public class AgentDeSaisieController {
    @Autowired private AgentDeSaisieService service;
    @PostMapping public AgentDeSaisieDTO create(@RequestBody AgentDeSaisieDTO dto) { return service.create(dto); }
    @GetMapping public List<AgentDeSaisieDTO> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public AgentDeSaisieDTO get(@PathVariable Long id) { return service.get(id); }
    @PutMapping("/{id}") public AgentDeSaisieDTO update(@PathVariable Long id, @RequestBody AgentDeSaisieDTO dto) { return service.update(id, dto); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}
