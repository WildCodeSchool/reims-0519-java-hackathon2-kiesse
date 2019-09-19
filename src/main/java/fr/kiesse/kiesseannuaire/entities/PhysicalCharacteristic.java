package fr.kiesse.kiesseannuaire.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PhysicalCharacteristic{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String capillarity;
    private Boolean mustache;
    private Boolean beard;
    private Boolean glasses;
    private Boolean sexe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCapillarity() {
        return capillarity;
    }

    public void setCapillarity(String capillarity) {
        this.capillarity = capillarity;
    }

    public Boolean getMustache() {
        return mustache;
    }

    public void setMustache(Boolean mustache) {
        this.mustache = mustache;
    }

    public Boolean getBeard() {
        return beard;
    }

    public void setBeard(Boolean beard) {
        this.beard = beard;
    }

    public Boolean getGlasses() {
        return glasses;
    }

    public void setGlasses(Boolean glasses) {
        this.glasses = glasses;
    }

    public Boolean getSexe() {
        return sexe;
    }

    public void setSexe(Boolean sexe) {
        this.sexe = sexe;
    }
}