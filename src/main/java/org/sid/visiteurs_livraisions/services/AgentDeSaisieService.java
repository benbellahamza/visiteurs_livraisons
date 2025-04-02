package org.sid.visiteurs_livraisions.services;

import org.sid.visiteurs_livraisions.dtos.AgentDeSaisieDTO;
import org.sid.visiteurs_livraisions.entities.AgentDeSaisie;
import org.sid.visiteurs_livraisions.mappers.AgentDeSaisieMapper;
import org.sid.visiteurs_livraisions.repositories.AgentDeSaisieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgentDeSaisieService {
    @Autowired private AgentDeSaisieRepository repo;
    @Autowired private AgentDeSaisieMapper mapper;

    public AgentDeSaisieDTO create(AgentDeSaisieDTO dto) { return mapper.toDto(repo.save(mapper.toEntity(dto))); }
    public List<AgentDeSaisieDTO> getAll() { return repo.findAll().stream().map(mapper::toDto).toList(); }
    public AgentDeSaisieDTO get(Long id) { return mapper.toDto(repo.findById(id).orElseThrow()); }
    public AgentDeSaisieDTO update(Long id, AgentDeSaisieDTO dto) { AgentDeSaisie e = mapper.toEntity(dto); e.setId(id); return mapper.toDto(repo.save(e)); }
    public void delete(Long id) { repo.deleteById(id); }
}