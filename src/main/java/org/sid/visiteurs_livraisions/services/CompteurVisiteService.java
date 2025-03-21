package org.sid.visiteurs_livraisions.services;

import org.sid.visiteurs_livraisions.dtos.CompteurVisiteDTO;
import org.sid.visiteurs_livraisions.entities.CompteurVisite;
import org.sid.visiteurs_livraisions.mappers.CompteurVisiteMapper;
import org.sid.visiteurs_livraisions.repositories.CompteurVisiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteurVisiteService {
    @Autowired
    private CompteurVisiteRepository compteurVisiteRepository;

    @Autowired
    private CompteurVisiteMapper compteurVisiteMapper;

    public CompteurVisiteDTO createCompteurVisite(CompteurVisiteDTO compteurVisiteDTO) {
        CompteurVisite compteurVisite = compteurVisiteMapper.toEntity(compteurVisiteDTO);
        compteurVisite = compteurVisiteRepository.save(compteurVisite);
        return compteurVisiteMapper.toDto(compteurVisite);
    }
}
