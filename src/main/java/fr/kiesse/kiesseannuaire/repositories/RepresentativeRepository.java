package fr.kiesse.kiesseannuaire.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.kiesse.kiesseannuaire.entities.Representative;

@Repository
public interface RepresentativeRepository extends JpaRepository<Representative, Long>{
}