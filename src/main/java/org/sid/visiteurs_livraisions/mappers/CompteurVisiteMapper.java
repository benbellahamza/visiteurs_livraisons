package org.sid.visiteurs_livraisions.mappers;

import org.sid.visiteurs_livraisions.dtos.CompteurVisiteDTO;
import org.sid.visiteurs_livraisions.entities.CompteurVisite;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CompteurVisiteMapper {

    CompteurVisiteMapper INSTANCE = Mappers.getMapper(CompteurVisiteMapper.class);

    @Mapping(source = "agentDeSaisie.id", target = "agentId")
    CompteurVisiteDTO toDto(CompteurVisite compteurVisite);

    @Mapping(source = "agentId", target = "agentDeSaisie.id")
    CompteurVisite toEntity(CompteurVisiteDTO compteurVisiteDTO);
}