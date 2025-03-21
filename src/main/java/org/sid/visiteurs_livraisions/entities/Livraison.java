package org.sid.visiteurs_livraisions.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomChauffeur;
    private String prenomChauffeur;
    private String cinChauffeur;
    private String marqueCamion;
    private String matriculeCamion;
    private String numChassis;
    private Date dateLivraison;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private AgentDeSaisie agentDeSaisie;
}
