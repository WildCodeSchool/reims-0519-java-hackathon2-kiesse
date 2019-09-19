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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSiteweb() {
        return siteweb;
    }

    public void setSiteweb(String siteweb) {
        this.siteweb = siteweb;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

}