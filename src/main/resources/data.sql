-- Insérer des utilisateurs
INSERT INTO UTILISATEUR (username, password, role) VALUES
                                                       ('admin1', 'password123', 'ADMIN'),
                                                       ('agent1', 'password456', 'AGENT'),
                                                       ('resp_visiteurs', 'password789', 'RESPONSABLE_VISITEURS'),
                                                       ('resp_livraisons', 'password101', 'RESPONSABLE_LIVRAISONS');

-- Insérer des visiteurs
INSERT INTO VISITEUR (id, nom, prenom, cin, sexe, destination, numero_chassis, date_visite, utilisateur_id) VALUES
                                                                                                                (1, 'Dupont', 'Jean', '123456789', 'M', 'Atelier', 'ABC123', '2023-10-01 10:00:00', 2),
                                                                                                                (2, 'Martin', 'Marie', '987654321', 'F', 'Comptoire PR', NULL, '2023-10-02 11:00:00', 2);

-- Insérer des livraisons
INSERT INTO LIVRAISON (id, nom_chauffeur, cin_chauffeur, societe, numero_camion, date_livraison, utilisateur_id) VALUES
                                                                                                                     (1, 'Dubois', '112233445', 'Transport Express', 'XYZ789', '2023-10-01 14:00:00', 2),
                                                                                                                     (2, 'Leroy', '556677889', 'Fast Delivery', 'LMN456', '2023-10-02 15:00:00', 2);