package com.openwebinars.spring.entity;

import java.util.List;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //DOCUMENTAR AMB OPENAPI
    @Schema( example = "Jaime", description = "Esquema para organizar los nombres")
    private String name;
    @Schema( example = "Ayudante", description = "Esquema para organizar los puestos")
    private String job;
    private String description;
    private String location;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ofertes> ofertes;
    
    public Empresa() {
		
	}


    public Empresa(String name, String job, String description, String location) {
        this.name = name;
        this.job = job;
        this.description = description;
        this.location = location;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getJob() {
        return this.job;
    }

    public String getDescription() {
        return this.description;
    }

    public String getLocation() {
        return this.location;
    }

    public List<Ofertes> getOfertes() {
        return this.ofertes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOfertes(List<Ofertes> ofertes) {
        this.ofertes = ofertes;
    }

}
