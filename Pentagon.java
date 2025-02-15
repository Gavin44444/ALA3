/**
* class Pentagon that inherits from abstract class Shape
* @author: Gavin Crowley
* @version: 01
*/
public class Pentagon extends Shape {
    private double side;

    /**
    * default constructor
    */
    public Pentagon() {
        super();
        side = 1.0;
    }

    /**
    * constructor with two params
    * 
    * @param color a string for the color of the pentagon
    * @param side a double value of the sides of the pentagon
    */
    public Pentagon(String color, double side) {
        super(color);
        this.side = side;
    }

    /**
    * accessor for the side length
    * 
    * @return the side as a double value
    */
    public double getside() {
        return side;
    }

    /**
    * mutator for the side length
    * 
    * @param s the side as a double value
    */
    public void setside(double s) {
        side = s;
    }

    /**
    * Returns a string representation of the pentagon, including its color, side length,
    * area, and perimeter.
    * 
    * @return a formatted string representing the pentagon's details
    */
    public String toString() {
        return String.format("%-10s\t%s\t%-10.2f", "Pentagon", super.toString(), side, getArea(), getPerimeter());
    }

    /**
    * Calculates the area of the pentagon using the formula for a regular pentagon.
    * 
    * @return the area of the pentagon
    */
    public double getArea() {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side;
    }

    /**
    * Calculates the perimeter of the pentagon, which is five times the side length.
    * 
    * @return the perimeter of the pentagon
    */
    public double getPerimeter() {
        return side * 5;
    }

    /**
    * Creates a deep copy (clone) of the pentagon.
    * 
    * @return a cloned instance of the pentagon
    */
    public Object clone() {
        return new Pentagon(this.getColor(), side);
    }

    /**
    * Scales the pentagon by a specified factor.
    * 
    * @param f the factor by which to scale the pentagon
    */
    public void scale(double f) {
        side *= f;
    }
}
