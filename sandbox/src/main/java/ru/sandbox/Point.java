package ru.sandbox;

import static java.lang.Math.sqrt;

/**
 * Created by o.nikolskaya on 27.10.2017.
 */
public class Point {
    public double x;
    public double y;


    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(double x1, double y1, double x2, double y2){
        return sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
    }
}
