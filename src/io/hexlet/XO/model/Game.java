package io.hexlet.XO.model;

public class Game {

    private final String name;

    private final Player[] players;

    private final Field field;


    public Game(String name, Player[] players, Field field) {
        this.name = name;
        this.players = players;
        this.field = field;
    }


    public Field getField() {
        return field;
    }

    public Player[] getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }
}
