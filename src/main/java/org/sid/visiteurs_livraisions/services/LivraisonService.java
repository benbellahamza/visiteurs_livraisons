package org.sid.visiteurs_livraisions.services;

import org.sid.visiteurs_livraisions.dtos.LivraisonDTO;
import org.sid.visiteurs_livraisions.entities.Livraison;
import org.sid.visiteurs_livraisions.mappers.LivraisonMapper;
import org.sid.visiteurs_livraisions.repositories.LivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivraisonService {
    @Autowired private LivraisonRepository repo;
    @Autowired private LivraisonMapper mapper;

    public LivraisonDTO create(LivraisonDTO dto) { return mapper.toDto(repo.save(mapper.toEntity(dto))); }
    public List<LivraisonDTO> getAll() { return repo.findAll().stream().map(mapper::toDto).toList(); }
    public LivraisonDTO get(Long id) { return mapper.toDto(repo.findById(id).orElseThrow()); }
    public LivraisonDTO update(Long id, LivraisonDTO dto) { Livraison e = mapper.toEntity(dto); e.setId(id); return mapper.toDto(repo.save(e)); }
    public void delete(Long id) { repo.deleteById(id); }
}