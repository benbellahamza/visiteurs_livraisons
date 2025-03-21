package org.sid.visiteurs_livraisions.services;

import org.sid.visiteurs_livraisions.dtos.AgentDeSaisieDTO;
import org.sid.visiteurs_livraisions.entities.AgentDeSaisie;
import org.sid.visiteurs_livraisions.mappers.AgentDeSaisieMapper;
import org.sid.visiteurs_livraisions.repositories.AgentDeSaisieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentDeSaisieService {
    @Autowired
    private AgentDeSaisieRepository agentDeSaisieRepository;

    @Autowired
    private AgentDeSaisieMapper agentDeSaisieMapper;

    public AgentDeSaisieDTO createAgentDeSaisie(AgentDeSaisieDTO agentDeSaisieDTO) {
        AgentDeSaisie agentDeSaisie = agentDeSaisieMapper.toEntity(agentDeSaisieDTO);
        agentDeSaisie = agentDeSaisieRepository.save(agentDeSaisie);
        return agentDeSaisieMapper.toDto(agentDeSaisie);
    }
}
