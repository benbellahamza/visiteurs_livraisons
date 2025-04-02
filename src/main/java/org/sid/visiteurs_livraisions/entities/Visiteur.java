package org.sid.visiteurs_livraisions.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
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
