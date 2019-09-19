package fr.kiesse.kiesseannuaire.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.kiesse.kiesseannuaire.entities.PhysicalCharacteristic;

@Repository
public interface PhysicalCharacteristicRepository extends JpaRepository<PhysicalCharacteristic, Long>{
}