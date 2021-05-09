package org.oop;


public class Point {

    protected double x;
    protected double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    protected static double calculatedistance(Point from, Point to) {
        double xDistance = to.x - from.x;
        double yDistance = to.y - from.y;


        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    protected static double calculatedirection(Point from, Point to) {
        double xDistance = to.x - from.x;
        double yDistance = to.y - from.y;
        return Math.atan2(yDistance, xDistance);
    }

}