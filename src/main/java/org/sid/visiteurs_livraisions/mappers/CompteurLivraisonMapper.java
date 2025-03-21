package org.sid.visiteurs_livraisions.mappers;

import org.sid.visiteurs_livraisions.dtos.CompteurLivraisonDTO;
import org.sid.visiteurs_livraisions.entities.CompteurLivraison;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompteurLivraisonMapper {
    @Mapping(target = "agentId", source = "agentDeSaisie.id")
    CompteurLivraisonDTO toDto(CompteurLivraison compteurLivraison);

    @Mapping(target = "agentDeSaisie.id", source = "agentId")
    CompteurLivraison toEntity(CompteurLivraisonDTO compteurLivraisonDTO);
}
