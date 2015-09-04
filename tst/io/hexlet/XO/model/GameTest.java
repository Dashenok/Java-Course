package io.hexlet.XO.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testGetField() throws Exception {
        final Field insertField = new Field();
        final Field expectedField = insertField;
        final Game game = new Game(null, null, insertField);

        final Field actualField = game.getField();

        assertEquals(expectedField, actualField);

    }

    @Test
    public void testGetPlayers() throws Exception {
        final String playerName = "Slava";
        final Figure figure = Figure.O;

        final Player[] insertPlayers = new Player[]{new Player(playerName, figure)};
        final Player[] expectedPlayers = insertPlayers;
        final Game game = new Game(null, insertPlayers, null);

        final Player[] actualPlayer = game.getPlayers();

        assertEquals(expectedPlayers, actualPlayer);

    }

    @Test
    public void testGetName() throws Exception {
        final String insertName = "XO";
        final String expectedName = insertName;
        final Game game = new Game(insertName, null, null);

        final String actualName = game.getName();

        assertEquals(expectedName, actualName);

    }
}