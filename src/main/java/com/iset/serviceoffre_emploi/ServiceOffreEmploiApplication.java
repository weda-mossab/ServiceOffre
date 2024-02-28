package com.iset.serviceoffre_emploi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iset.serviceoffre_emploi.entities.Offre;
import com.iset.serviceoffre_emploi.repositories.OffreRepository;

@SpringBootApplication
public class ServiceOffreEmploiApplication implements CommandLineRunner {

	@Autowired
	OffreRepository offreRepository;
	public static void main(String[] args) {
		SpringApplication.run(ServiceOffreEmploiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		offreRepository.save(new Offre(0, "web design", "informatique", "AXA", 2, "France"));
		offreRepository.save(new Offre(1,"Developpeur", "informatique","Talys", 3, "Tunisie")); 
 		offreRepository.save(new Offre(2, "Architecte","informatique","SIS", 2, "Allemagne"));
	}

}
