package fr.kiesse.kiesseannuaire.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.kiesse.kiesseannuaire.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{
}