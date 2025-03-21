package org.sid.visiteurs_livraisions.web;

import org.sid.visiteurs_livraisions.dtos.AgentDeSaisieDTO;
import org.sid.visiteurs_livraisions.services.AgentDeSaisieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agents")
public class AgentDeSaisieController {
    @Autowired
    private AgentDeSaisieService agentDeSaisieService;

    @PostMapping
    public AgentDeSaisieDTO createAgentDeSaisie(@RequestBody AgentDeSaisieDTO agentDeSaisieDTO) {
        return agentDeSaisieService.createAgentDeSaisie(agentDeSaisieDTO);
    }
}
