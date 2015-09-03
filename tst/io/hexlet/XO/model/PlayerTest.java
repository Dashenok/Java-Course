package io.hexlet.XO.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testGetName() throws Exception {
        final String inputValue = "Slava";
        final String expetedValue = inputValue;

        final Player player = new Player(inputValue, null);

        final String actualValue = player.getName();

        assertEquals(expetedValue, actualValue);

    }

    @Test
    public void testGetFigure() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expetedValue = inputValue;

        final Player player = new Player(null, inputValue);

        final Figure actualValue = player.getFigure();

        assertEquals(expetedValue, actualValue);

    }
}