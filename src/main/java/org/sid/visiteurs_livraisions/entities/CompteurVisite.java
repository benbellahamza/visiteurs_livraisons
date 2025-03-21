package org.sid.visiteurs_livraisions.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class CompteurVisite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int nombreVisites;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private AgentDeSaisie agentDeSaisie;
}
