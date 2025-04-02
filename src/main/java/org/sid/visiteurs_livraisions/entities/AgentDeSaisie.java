package org.sid.visiteurs_livraisions.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AgentDeSaisie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String username;
    private String password;
    @OneToMany(mappedBy = "agentDeSaisie")  // Relation avec CompteurVisite
    private List<CompteurVisite> compteurVisites;
}
