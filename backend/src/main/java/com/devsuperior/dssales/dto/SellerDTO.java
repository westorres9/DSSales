package com.devsuperior.dssales.dto;

import com.devsuperior.dssales.entities.Seller;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class SellerDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    @NotBlank(message = "Campo requerido")
    public String name;
    @Email(message = "Email inválido")
    public String email;
    @NotNull(message = "Campo requerido")
    public TeamDTO team;

    public SellerDTO() {
    }

    public SellerDTO(Long id, String name, String email, TeamDTO team) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.team = team;
    }

    public SellerDTO(Seller entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.team = new TeamDTO(entity.getTeam());
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        this.team = team;
    }
}
