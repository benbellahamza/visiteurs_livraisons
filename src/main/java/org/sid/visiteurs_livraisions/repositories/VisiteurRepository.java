package org.sid.visiteurs_livraisions.repositories;

import org.sid.visiteurs_livraisions.entities.Visiteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisiteurRepository extends JpaRepository<Visiteur, Long> {
}
