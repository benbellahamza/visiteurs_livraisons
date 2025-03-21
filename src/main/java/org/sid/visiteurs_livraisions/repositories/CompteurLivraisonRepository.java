package org.sid.visiteurs_livraisions.repositories;

import org.sid.visiteurs_livraisions.entities.CompteurLivraison;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteurLivraisonRepository extends JpaRepository<CompteurLivraison, Long> {
}
