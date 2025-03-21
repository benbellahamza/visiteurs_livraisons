package org.sid.visiteurs_livraisions.mappers;

import org.sid.visiteurs_livraisions.dtos.CompteurVisiteDTO;
import org.sid.visiteurs_livraisions.entities.AgentDeSaisie;
import org.sid.visiteurs_livraisions.entities.CompteurVisite;
import org.junit.jupiter.api.Test;  // Import pour @Test
import org.junit.jupiter.api.Assertions;  // Import pour Assertions
import org.springframework.boot.test.context.SpringBootTest;  // Import pour @SpringBootTest

import java.util.Date;

@SpringBootTest
public class CompteurVisiteMapperTest {

    @Test
    public void testToDto() {
        // Créer une entité CompteurVisite
        AgentDeSaisie agentDeSaisie = new AgentDeSaisie();
        agentDeSaisie.setId(1L);

        CompteurVisite compteurVisite = new CompteurVisite();
        compteurVisite.setId(1L);
        compteurVisite.setNombreVisites(10);
        compteurVisite.setDate(new Date());
        compteurVisite.setAgentDeSaisie(agentDeSaisie);

        // Mapper vers DTO
        CompteurVisiteDTO compteurVisiteDTO = CompteurVisiteMapper.INSTANCE.toDto(compteurVisite);

        // Vérifier les valeurs
        Assertions.assertEquals(compteurVisite.getId(), compteurVisiteDTO.getId());
        Assertions.assertEquals(compteurVisite.getNombreVisites(), compteurVisiteDTO.getNombreVisites());
        Assertions.assertEquals(compteurVisite.getDate(), compteurVisiteDTO.getDate());
        Assertions.assertEquals(compteurVisite.getAgentDeSaisie().getId(), compteurVisiteDTO.getAgentId());
    }

    @Test
    public void testToEntity() {
        // Créer un DTO CompteurVisiteDTO
        CompteurVisiteDTO compteurVisiteDTO = new CompteurVisiteDTO();
        compteurVisiteDTO.setId(1L);
        compteurVisiteDTO.setNombreVisites(10);
        compteurVisiteDTO.setDate(new Date());
        compteurVisiteDTO.setAgentId(1L);

        // Mapper vers entité
        CompteurVisite compteurVisite = CompteurVisiteMapper.INSTANCE.toEntity(compteurVisiteDTO);

        // Vérifier les valeurs
        Assertions.assertEquals(compteurVisiteDTO.getId(), compteurVisite.getId());
        Assertions.assertEquals(compteurVisiteDTO.getNombreVisites(), compteurVisite.getNombreVisites());
        Assertions.assertEquals(compteurVisiteDTO.getDate(), compteurVisite.getDate());
        Assertions.assertEquals(compteurVisiteDTO.getAgentId(), compteurVisite.getAgentDeSaisie().getId());
    }
}
