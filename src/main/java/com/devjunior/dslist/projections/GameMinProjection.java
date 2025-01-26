package com.devjunior.dslist.projections;

public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgURL();
    String getShortDescription();
    Integer getPosition();
}
