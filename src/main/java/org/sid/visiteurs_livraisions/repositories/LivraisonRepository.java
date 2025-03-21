package org.sid.visiteurs_livraisions.repositories;

import org.sid.visiteurs_livraisions.entities.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivraisonRepository extends JpaRepository<Livraison, Long> {
}
