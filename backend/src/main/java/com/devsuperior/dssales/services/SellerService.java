package com.devsuperior.dssales.services;

import com.devsuperior.dssales.dto.SellerDTO;
import com.devsuperior.dssales.entities.Seller;
import com.devsuperior.dssales.entities.Team;
import com.devsuperior.dssales.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;


public class SellerService {

    @Autowired
    private SellerRepository repository;

    @Transactional(readOnly = true)
    public Page<SellerDTO> findAll(Pageable pageable) {
        Page<Seller> page = repository.findAll(pageable);
        return page.map(x -> new SellerDTO(x));
    }

    @Transactional
    public SellerDTO insert(SellerDTO dto) {
        Seller entity = new Seller();
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setTeam(new Team(dto.getTeam().getId()));
        entity = repository.save(entity);
        return new SellerDTO(entity);
    }
}
