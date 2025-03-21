package org.sid.visiteurs_livraisions.dtos;

import lombok.Data;
import java.util.Date;

@Data
public class CompteurVisiteDTO {
    private Long id;
    private int nombreVisites;
    private Date date;
    private Long agentId;  // Cette propriété doit exister
}
