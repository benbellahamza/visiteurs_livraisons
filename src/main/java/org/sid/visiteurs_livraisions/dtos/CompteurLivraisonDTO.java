package org.sid.visiteurs_livraisions.dtos;

import lombok.Data;
import java.util.Date;

@Data
public class CompteurLivraisonDTO {
    private Long id;
    private int nombreLivraisons;
    private Date date;
    private Long agentId;
}