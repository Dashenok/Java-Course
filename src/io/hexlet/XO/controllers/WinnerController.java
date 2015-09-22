package io.hexlet.XO.controllers;

import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.exceptions.InvalidPointException;

import java.awt.*;

public class WinnerController {

    public Figure getWinner(final Field field){
        try {
            for (int i = 0; i < 3; i++) {
                if (check(field, new Point(i, 0), point -> new Point(point.x, point.y + 1)) ||
                        check(field, new Point(0, i), point1 -> new Point(point1.x + 1, point1.y)))
                    return field.getFigure(new Point(i, 0));
            }

            for (int i = 0; i < 3; i++) {
                if (check(field, new Point(i, i), point -> new Point(point.x + 1, point.y + 1)))
                    return field.getFigure(new Point(i, 0));
            }


            for (int i = 0; i < 3; i++) {
                if (check(field, new Point(i, 2 - i), point -> new Point(point.x + 1, point.y - 1)))
                    return field.getFigure(new Point(i, 0));

            }
        }
                catch (InvalidPointException e) {
                e.printStackTrace();
            }

        return null;
    }

    private boolean check(final Field field,
                          final Point currentPoint,
                          final IPointGenerator pointGenerator){
        final Figure currentFigure;
        final Figure nextFigure;
        final Point nextPoint = pointGenerator.next(currentPoint);

        try {
            currentFigure = field.getFigure(currentPoint);
            nextFigure = field.getFigure(nextPoint);
        } catch (InvalidPointException e) {
            return true;
        }

        if (currentFigure == null) return false;
        if (currentFigure != nextFigure) return false;

        return check(field, nextPoint, pointGenerator);

    }
    private interface IPointGenerator{
        public Point next(final Point point);
    }
}
