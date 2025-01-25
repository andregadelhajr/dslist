package com.devjunior.dslist.dto;

import com.devjunior.dslist.entities.Game;
import jakarta.persistence.Column;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgURL;
    private String shortDescription;

    public GameMinDTO() {}

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgURL = entity.getImgURL();
        this.shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgURL() {
        return imgURL;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
