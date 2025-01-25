package com.devjunior.dslist.services;

import com.devjunior.dslist.dto.GameMinDTO;
import com.devjunior.dslist.entities.Game;
import com.devjunior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        List<Game> result = repository.findAll();

        return result
                .stream()
                .map(GameMinDTO::new)
                .toList();
    }
}
