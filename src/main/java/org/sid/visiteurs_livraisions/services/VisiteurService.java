package org.sid.visiteurs_livraisions.services;

import org.sid.visiteurs_livraisions.dtos.VisiteurDTO;
import org.sid.visiteurs_livraisions.entities.Visiteur;
import org.sid.visiteurs_livraisions.mappers.VisiteurMapper;
import org.sid.visiteurs_livraisions.repositories.VisiteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisiteurService {
    @Autowired private VisiteurRepository visiteurRepository;
    @Autowired private VisiteurMapper visiteurMapper;

    public VisiteurDTO createVisiteur(VisiteurDTO dto) {
        Visiteur entity = visiteurMapper.toEntity(dto);
        return visiteurMapper.toDto(visiteurRepository.save(entity));
    }

    public List<VisiteurDTO> getAllVisiteurs() {
        return visiteurRepository.findAll().stream().map(visiteurMapper::toDto).toList();
    }

    public VisiteurDTO getVisiteurById(Long id) {
        return visiteurMapper.toDto(visiteurRepository.findById(id).orElseThrow());
    }

    public VisiteurDTO updateVisiteur(Long id, VisiteurDTO dto) {
        Visiteur entity = visiteurMapper.toEntity(dto);
        entity.setId(id);
        return visiteurMapper.toDto(visiteurRepository.save(entity));
    }

    public void deleteVisiteur(Long id) {
        visiteurRepository.deleteById(id);
    }
}