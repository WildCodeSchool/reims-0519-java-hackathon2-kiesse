package fr.kiesse.kiesseannuaire.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logo;

    private String adress;

    private String phone;

    private String email;

    private String siteweb;

    private String mission;

    private String speciality;

    public Company() {
        
    }

    public Company(Long id, String logo, String adress, String phone, String email, String siteweb, String mission,
            String speciality) {
        this.id = id;
        this.logo = logo;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.siteweb = siteweb;
        this.mission = mission;
        this.speciality = speciality;
    }

    public Company(String logo, String adress, String phone, String email, String siteweb, String mission,
            String speciality) {
        this.logo = logo;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.siteweb = siteweb;
        this.mission = mission;
        this.speciality = speciality;
    }

}