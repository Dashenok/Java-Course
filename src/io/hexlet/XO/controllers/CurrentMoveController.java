package io.hexlet.XO.controllers;


import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.exceptions.InvalidPointException;

import java.awt.*;

public class CurrentMoveController {

    public Figure currentMove(final Field field){
        int fieldCounter = 0;
        for (int i = 0; i < field.getFieldSize(); i++) {
            for (int j = 0; j < field.getFieldSize(); j++) {
                try {
                    if (field.getFigure(new Point(i, j)) != null){
                        fieldCounter++;
                    }
                } catch (InvalidPointException e) {
                    e.printStackTrace();
                }
            }
        }
        if (fieldCounter == field.getFieldSize()*field.getFieldSize()) return null;

        if (fieldCounter % 2 == 0) return Figure.X;

        return Figure.O;
    }
}
