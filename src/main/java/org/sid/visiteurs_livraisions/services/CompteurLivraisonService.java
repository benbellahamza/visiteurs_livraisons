package org.sid.visiteurs_livraisions.services;

import org.sid.visiteurs_livraisions.dtos.CompteurLivraisonDTO;
import org.sid.visiteurs_livraisions.entities.CompteurLivraison;
import org.sid.visiteurs_livraisions.mappers.CompteurLivraisonMapper;
import org.sid.visiteurs_livraisions.repositories.CompteurLivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteurLivraisonService {
    @Autowired private CompteurLivraisonRepository repo;
    @Autowired private CompteurLivraisonMapper mapper;

    public CompteurLivraisonDTO create(CompteurLivraisonDTO dto) { return mapper.toDto(repo.save(mapper.toEntity(dto))); }
    public List<CompteurLivraisonDTO> getAll() { return repo.findAll().stream().map(mapper::toDto).toList(); }
    public CompteurLivraisonDTO get(Long id) { return mapper.toDto(repo.findById(id).orElseThrow()); }
    public CompteurLivraisonDTO update(Long id, CompteurLivraisonDTO dto) { CompteurLivraison e = mapper.toEntity(dto); e.setId(id); return mapper.toDto(repo.save(e)); }
    public void delete(Long id) { repo.deleteById(id); }
}