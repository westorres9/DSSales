package com.devsuperior.dssales.resources;

import com.devsuperior.dssales.dto.TeamDTO;
import com.devsuperior.dssales.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/teams")
public class TeamResource {

    @Autowired
    private TeamService service;

    @GetMapping
    public ResponseEntity<List<TeamDTO>> findAll() {
        List<TeamDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
