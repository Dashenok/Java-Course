package io.hexlet.XO.controllers;

import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.exceptions.AlreadyOccupiedException;
import io.hexlet.XO.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws InvalidPointException,
                                                        AlreadyOccupiedException{

        if (field.getFigure(point) != null){
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);

    }

}
