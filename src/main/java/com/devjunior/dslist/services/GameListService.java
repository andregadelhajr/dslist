package com.devjunior.dslist.services;

import com.devjunior.dslist.dto.GameListDTO;
import com.devjunior.dslist.entities.GameList;
import com.devjunior.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = repository.findAll();

        return result
                .stream()
                .map(GameListDTO::new)
                .toList();
    }
}
