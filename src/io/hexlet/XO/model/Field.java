package io.hexlet.XO.model;

import io.hexlet.XO.model.exceptions.InvalidPointException;
import io.hexlet.XO.model.exceptions.AlreadyOccupiedException;

import java.awt.*;

public class Field {


    private static final int MIN_COORDINATE = 0;

    private final int fieldSize;

    private final Figure[][] field;

    public Field(int fieldSize) {
        this.fieldSize = fieldSize;
        field = new Figure[fieldSize][fieldSize];
    }

    public int getFieldSize(){
        return fieldSize;
    }

    public Figure getFigure(final Point point) throws InvalidPointException {
        if (!checkPoint(point)){
            throw new InvalidPointException();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException, AlreadyOccupiedException {
        if (!checkPoint(point)){
            throw new InvalidPointException();
        }
        assert figure != null;
        field[point.x][point.y] = figure;
    }

    private boolean checkPoint(final Point point){
        return checkCoordinate(point.x, field.length) && checkCoordinate(point.y, field[point.x].length);

    }

    private boolean checkCoordinate(final int coordinate, final int maxCoordinate){
        return coordinate >= MIN_COORDINATE && coordinate < maxCoordinate;
    }
}
