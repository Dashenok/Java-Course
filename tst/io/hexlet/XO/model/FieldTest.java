package io.hexlet.XO.model;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by dashenka on 03.09.15.
 */
public class FieldTest {

    @Test
    public void testGetFieldSize() throws Exception {
        final Field field = new Field();

        assertEquals(3, field.getFieldSize());

    }

    @Test
    public void testSetFigure() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0,0);
        final Figure inputFigure = Figure.O;
        final Figure expectedFigure = inputFigure;

        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);
        assertEquals(expectedFigure, actualFigure);
    }
}