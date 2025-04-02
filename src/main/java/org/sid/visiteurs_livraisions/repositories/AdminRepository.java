package org.sid.visiteurs_livraisions.repositories;

import org.sid.visiteurs_livraisions.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByUsername(String username);
}
