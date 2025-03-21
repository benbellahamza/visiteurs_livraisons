package org.sid.visiteurs_livraisions.repositories;

import org.sid.visiteurs_livraisions.entities.CompteurVisite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteurVisiteRepository extends JpaRepository<CompteurVisite, Long> {
}
