package com.devjunior.dslist.controllers;

import com.devjunior.dslist.dto.GameMinDTO;
import com.devjunior.dslist.entities.Game;
import com.devjunior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDTO> findAll() {
        return service.findAll();
    }
}