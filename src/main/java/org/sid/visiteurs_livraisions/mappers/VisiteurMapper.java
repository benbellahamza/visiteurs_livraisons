package org.sid.visiteurs_livraisions.mappers;

import org.sid.visiteurs_livraisions.dtos.VisiteurDTO;
import org.sid.visiteurs_livraisions.entities.Visiteur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VisiteurMapper {
    @Mapping(target = "agentId", source = "agentDeSaisie.id")
    VisiteurDTO toDto(Visiteur visiteur);

    @Mapping(target = "agentDeSaisie.id", source = "agentId")
    Visiteur toEntity(VisiteurDTO visiteurDTO);
}
