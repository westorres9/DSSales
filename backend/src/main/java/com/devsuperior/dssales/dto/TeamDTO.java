package com.devsuperior.dssales.dto;

import com.devsuperior.dssales.entities.Team;

import java.io.Serializable;

public class TeamDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public TeamDTO(){
    }

    public TeamDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public TeamDTO(Team entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
