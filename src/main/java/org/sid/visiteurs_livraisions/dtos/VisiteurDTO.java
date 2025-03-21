package org.sid.visiteurs_livraisions.dtos;

import lombok.Data;
import java.util.Date;

@Data
public class VisiteurDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String cin;
    private String destination;
    private Date dateVisite;
    private Long agentId;
}
