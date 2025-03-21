package org.sid.visiteurs_livraisions.services;

import org.sid.visiteurs_livraisions.dtos.LivraisonDTO;
import org.sid.visiteurs_livraisions.entities.Livraison;
import org.sid.visiteurs_livraisions.mappers.LivraisonMapper;
import org.sid.visiteurs_livraisions.repositories.LivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivraisonService {
    @Autowired
    private LivraisonRepository livraisonRepository;

    @Autowired
    private LivraisonMapper livraisonMapper;

    public LivraisonDTO createLivraison(LivraisonDTO livraisonDTO) {
        Livraison livraison = livraisonMapper.toEntity(livraisonDTO);
        livraison = livraisonRepository.save(livraison);
        return livraisonMapper.toDto(livraison);
    }
}
