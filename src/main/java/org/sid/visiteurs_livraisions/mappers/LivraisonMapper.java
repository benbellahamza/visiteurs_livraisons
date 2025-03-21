package org.sid.visiteurs_livraisions.mappers;

import org.sid.visiteurs_livraisions.dtos.LivraisonDTO;
import org.sid.visiteurs_livraisions.entities.Livraison;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LivraisonMapper {
    @Mapping(target = "agentId", source = "agentDeSaisie.id")
    LivraisonDTO toDto(Livraison livraison);

    @Mapping(target = "agentDeSaisie.id", source = "agentId")
    Livraison toEntity(LivraisonDTO livraisonDTO);
}
