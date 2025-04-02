package org.sid.visiteurs_livraisions.services;

import org.sid.visiteurs_livraisions.dtos.AdminDTO;
import org.sid.visiteurs_livraisions.entities.Admin;
import org.sid.visiteurs_livraisions.mappers.AdminMapper;
import org.sid.visiteurs_livraisions.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminService {
    @Autowired private AdminRepository repo;
    @Autowired private AdminMapper mapper;

    public AdminDTO create(AdminDTO dto) { return mapper.toDto(repo.save(mapper.toEntity(dto))); }
    public List<AdminDTO> getAll() { return repo.findAll().stream().map(mapper::toDto).toList(); }
    public AdminDTO get(Long id) { return mapper.toDto(repo.findById(id).orElseThrow()); }
    public AdminDTO update(Long id, AdminDTO dto) { Admin e = mapper.toEntity(dto); e.setId(id); return mapper.toDto(repo.save(e)); }
    public void delete(Long id) { repo.deleteById(id); }
}