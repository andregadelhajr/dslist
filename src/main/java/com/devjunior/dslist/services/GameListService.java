package com.devjunior.dslist.services;

import com.devjunior.dslist.dto.GameListDTO;
import com.devjunior.dslist.entities.GameList;
import com.devjunior.dslist.projections.GameMinProjection;
import com.devjunior.dslist.repositories.GameListRepository;
import com.devjunior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = repository.findAll();

        return result
                .stream()
                .map(GameListDTO::new)
                .toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {

        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);

        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        //int min = Math.min(sourceIndex, destinationIndex);

        int max = sourceIndex < destinationIndex ? destinationIndex:sourceIndex;
        //int max = Math.max(sourceIndex, destinationIndex);

        for (int i = min; i <= max; i++) {
            repository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
