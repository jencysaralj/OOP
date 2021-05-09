package org.oop;
//import javafx.geometry.Point2D;
import org.oop.DistanceAndDirectionCalculator;
public class DistanceAndDirectionCalculator {

        protected static double distance(Point from, Point to) {
            double calculatedistance = Point.calculatedistance(from,to);
            return calculatedistance;
        }

        protected static double direction(Point from, Point to) {
            double calculatedirection = Point.calculatedirection(from,to);
            return calculatedirection;
        }

}
