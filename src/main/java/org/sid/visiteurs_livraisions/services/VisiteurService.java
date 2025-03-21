package org.sid.visiteurs_livraisions.services;

import org.sid.visiteurs_livraisions.dtos.VisiteurDTO;
import org.sid.visiteurs_livraisions.entities.Visiteur;
import org.sid.visiteurs_livraisions.mappers.VisiteurMapper;
import org.sid.visiteurs_livraisions.repositories.VisiteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisiteurService {
    @Autowired
    private VisiteurRepository visiteurRepository;

    @Autowired
    private VisiteurMapper visiteurMapper;

    public VisiteurDTO createVisiteur(VisiteurDTO visiteurDTO) {
        Visiteur visiteur = visiteurMapper.toEntity(visiteurDTO);
        visiteur = visiteurRepository.save(visiteur);
        return visiteurMapper.toDto(visiteur);
    }
}