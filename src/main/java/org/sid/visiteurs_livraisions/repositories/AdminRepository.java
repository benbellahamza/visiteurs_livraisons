package org.sid.visiteurs_livraisions.repositories;

import org.sid.visiteurs_livraisions.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
