package org.sid.visiteurs_livraisions.services;

import org.sid.visiteurs_livraisions.dtos.CompteurLivraisonDTO;
import org.sid.visiteurs_livraisions.entities.CompteurLivraison;
import org.sid.visiteurs_livraisions.mappers.CompteurLivraisonMapper;
import org.sid.visiteurs_livraisions.repositories.CompteurLivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteurLivraisonService {
    @Autowired
    private CompteurLivraisonRepository compteurLivraisonRepository;

    @Autowired
    private CompteurLivraisonMapper compteurLivraisonMapper;

    public CompteurLivraisonDTO createCompteurLivraison(CompteurLivraisonDTO compteurLivraisonDTO) {
        CompteurLivraison compteurLivraison = compteurLivraisonMapper.toEntity(compteurLivraisonDTO);
        compteurLivraison = compteurLivraisonRepository.save(compteurLivraison);
        return compteurLivraisonMapper.toDto(compteurLivraison);
    }
}
