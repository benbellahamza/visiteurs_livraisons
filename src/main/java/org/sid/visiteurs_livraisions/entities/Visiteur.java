package org.sid.visiteurs_livraisions.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class Visiteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String cin;
    private String destination;
    private Date dateVisite;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private AgentDeSaisie agentDeSaisie;
}
