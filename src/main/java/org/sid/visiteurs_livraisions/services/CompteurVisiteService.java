package org.sid.visiteurs_livraisions.services;

import org.sid.visiteurs_livraisions.dtos.CompteurVisiteDTO;
import org.sid.visiteurs_livraisions.entities.CompteurVisite;
import org.sid.visiteurs_livraisions.mappers.CompteurVisiteMapper;
import org.sid.visiteurs_livraisions.repositories.CompteurVisiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteurVisiteService {
    @Autowired private CompteurVisiteRepository repo;
    @Autowired private CompteurVisiteMapper mapper;

    public CompteurVisiteDTO create(CompteurVisiteDTO dto) { return mapper.toDto(repo.save(mapper.toEntity(dto))); }
    public List<CompteurVisiteDTO> getAll() { return repo.findAll().stream().map(mapper::toDto).toList(); }
    public CompteurVisiteDTO get(Long id) { return mapper.toDto(repo.findById(id).orElseThrow()); }
    public CompteurVisiteDTO update(Long id, CompteurVisiteDTO dto) { CompteurVisite e = mapper.toEntity(dto); e.setId(id); return mapper.toDto(repo.save(e)); }
    public void delete(Long id) { repo.deleteById(id); }
}
