package org.sid.visiteurs_livraisions.dtos;

import lombok.Data;

@Data
public class AgentDeSaisieDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String username;
    private String password;
}
