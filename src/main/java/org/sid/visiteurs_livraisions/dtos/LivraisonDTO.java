package org.sid.visiteurs_livraisions.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class LivraisonDTO {
    private Long id;
    private String nomChauffeur;
    private String prenomChauffeur;
    private String cinChauffeur;
    private String marqueCamion;
    private String matriculeCamion;
    private String numChassis;
    private Date dateLivraison;
    private Long agentId;
}