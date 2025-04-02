package org.sid.visiteurs_livraisions;

import org.sid.visiteurs_livraisions.entities.*;
import org.sid.visiteurs_livraisions.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class VisiteursLivraisionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisiteursLivraisionsApplication.class, args);
    }

    @Bean
    CommandLineRunner testEntities(
            AdminRepository adminRepo,
            AgentDeSaisieRepository agentRepo,
            CompteurLivraisonRepository compteurLivRepo,
            CompteurVisiteRepository compteurVisRepo,
            LivraisonRepository livraisonRepo,
            VisiteurRepository visiteurRepo
    ) {
        return args -> {
            Admin admin = new Admin();
            admin.setNom("Admin");
            admin.setPrenom("Principal");
            admin.setUsername("admin01");
            admin.setPassword("securepass"); // Mot de passe sans encodage
            adminRepo.save(admin);

            AgentDeSaisie agent = new AgentDeSaisie();
            agent.setNom("Saisie");
            agent.setPrenom("Agent");
            agent.setUsername("agent01");
            agent.setPassword("agentpass"); // Mot de passe sans encodage
            agent = agentRepo.save(agent);

            CompteurVisite compteurVisite = new CompteurVisite();
            compteurVisite.setNombreVisites(10);
            compteurVisite.setDate(new Date());
            compteurVisite.setAgentDeSaisie(agent);
            compteurVisRepo.save(compteurVisite);

            CompteurLivraison compteurLivraison = new CompteurLivraison();
            compteurLivraison.setNombreLivraisons(5);
            compteurLivraison.setDate(new Date());
            compteurLivraison.setAgentDeSaisie(agent);
            compteurLivRepo.save(compteurLivraison);

            Livraison livraison = new Livraison();
            livraison.setNomChauffeur("Ahmed");
            livraison.setPrenomChauffeur("Youssef");
            livraison.setCinChauffeur("AB123456");
            livraison.setMarqueCamion("Mercedes");
            livraison.setMatriculeCamion("1234-A-56");
            livraison.setNumChassis("CH-4567890");
            livraison.setDateLivraison(new Date());
            livraison.setAgentDeSaisie(agent);
            livraisonRepo.save(livraison);

            Visiteur visiteur = new Visiteur();
            visiteur.setNom("Ali");
            visiteur.setPrenom("Karim");
            visiteur.setCin("CD789456");
            visiteur.setDestination("Bureau 5");
            visiteur.setDateVisite(new Date());
            visiteur.setAgentDeSaisie(agent);
            visiteurRepo.save(visiteur);

            System.out.println("✅ Données de test insérées avec succès !");
        };
    }
}
