package io.hexlet.XO.model;

import io.hexlet.XO.model.exceptions.AlreadyOccupiedException;
import io.hexlet.XO.model.exceptions.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

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

    @Test
    public void testGetFigureIfFigureIsNotSet() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0,0);

        final Figure actualFigure = field.getFigure(inputPoint);
        assertNull(actualFigure);
    }

    @Test
    public void testGetFigureWhenXIsLessThenZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(-1,0);

        try{
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e){}

    }

    @Test
    public void testGetFigureWhenYIsLessThenZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, -1);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }
    @Test
    public void testGetFigureWhenXIsMoreThenSize() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(field.getFieldSize() + 1, 1);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }
    @Test
    public void testGetFigureWhenYIsMoreThenSize() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, field.getFieldSize() + 1);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }


    @Test
    public void testSetFigureWhenPointAlreadyOccupied() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure figure = Figure.O;
        field.setFigure(inputPoint, figure);

        try {
            field.setFigure(inputPoint, figure);
            fail();
        } catch (final AlreadyOccupiedException e) {
        }
    }

}