package com.devjunior.dslist.controllers;

import com.devjunior.dslist.dto.GameListDTO;
import com.devjunior.dslist.dto.GameMinDTO;
import com.devjunior.dslist.services.GameListService;
import com.devjunior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService service;

    @GetMapping
    public List<GameListDTO> findAll() {
        return service.findAll();
    }
}
