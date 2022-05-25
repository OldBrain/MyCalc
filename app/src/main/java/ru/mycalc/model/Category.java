package ru.mycalc.model;

public class Category {
    Integer id;
    String tile;

    public Category(Integer id, String tile) {
        this.id = id;
        this.tile = tile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }
}
