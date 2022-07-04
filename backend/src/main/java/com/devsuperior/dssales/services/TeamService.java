package com.devsuperior.dssales.services;

import com.devsuperior.dssales.dto.TeamDTO;
import com.devsuperior.dssales.entities.Team;
import com.devsuperior.dssales.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService {

    @Autowired
    private TeamRepository repository;

    public List<TeamDTO> findAll() {
        List<Team> list = repository.findAll(Sort.by("name"));
        return list.stream().map(x -> new TeamDTO(x)).collect(Collectors.toList());
    }
}
