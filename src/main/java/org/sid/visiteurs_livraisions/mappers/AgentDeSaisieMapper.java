package org.sid.visiteurs_livraisions.mappers;

import org.sid.visiteurs_livraisions.dtos.AgentDeSaisieDTO;
import org.sid.visiteurs_livraisions.entities.AgentDeSaisie;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AgentDeSaisieMapper {
    AgentDeSaisieDTO toDto(AgentDeSaisie agentDeSaisie);
    AgentDeSaisie toEntity(AgentDeSaisieDTO agentDeSaisieDTO);
}
