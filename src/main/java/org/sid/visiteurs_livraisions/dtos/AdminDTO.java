package org.sid.visiteurs_livraisions.dtos;

import lombok.Data;

@Data
public class AdminDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String username;
//    private String password; hidden
    private String role;
}
