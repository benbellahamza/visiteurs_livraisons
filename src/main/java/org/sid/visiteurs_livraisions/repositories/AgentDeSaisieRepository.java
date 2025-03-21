package org.sid.visiteurs_livraisions.repositories;

import org.sid.visiteurs_livraisions.entities.AgentDeSaisie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentDeSaisieRepository extends JpaRepository<AgentDeSaisie, Long> {
}