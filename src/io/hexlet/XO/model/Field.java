package io.hexlet.XO.model;

import java.awt.*;

public class Field {

    private static final int FIELD_SIZE = 3;

    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getFieldSize(){
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point){
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure){
        assert figure != null;
        field[point.x][point.y] = figure;
    }
}
