package org.sid.visiteurs_livraisions.web;
import org.sid.visiteurs_livraisions.dtos.AdminDTO;
import org.sid.visiteurs_livraisions.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminController {
    @Autowired private AdminService service;
    @PostMapping public AdminDTO create(@RequestBody AdminDTO dto) { return service.create(dto); }
    @GetMapping public List<AdminDTO> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public AdminDTO get(@PathVariable Long id) { return service.get(id); }
    @PutMapping("/{id}") public AdminDTO update(@PathVariable Long id, @RequestBody AdminDTO dto) { return service.update(id, dto); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}
