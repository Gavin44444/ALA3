/**
* class Circle that inherits from abstract class Shape
* @author: Gavin Crowley
* @version: 01
*/
public class Circle extends Shape {
    private double radius;

    /**
    * default constructor
    */
    public Circle() {
        super();
        radius = 1.0;
    }

    /**
    * Constructor with two params.
    * 
    * @param color a string of the color of the circle
    * @param radius a double of the radius of the circle
    */
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    /**
    * accessor for the radius of the circle
    * 
    * @return radius as a double 
    */
    public double getRadius() {
        return radius;
    }

    /**
    * mutator for the radius of the circle
    * 
    * @param r radius as a double 
    */
    public void setRadius(double r) {
        radius = r;
    }

    /**
    * Returns a string representation of the circle, including its color, radius,
    * area, and perimeter.
    * 
    * @return a formatted string representing the circle's details
    */
    public String toString() {
        return String.format("%-10s\t%s\t%-10.2f", "Circle", super.toString(), radius, getArea(), getPerimeter());
    }

    /**
    * Creates a deep copy (clone) of the circle.
    * 
    * @return a cloned instance of the circle
    */
    public Object clone() {
        return new Circle(this.getColor(), radius); // deep copy
    }

    /**
    * Calculates the area of the circle using the formula π * radius^2.
    * 
    * @return the area of the circle
    */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
    * Calculates the perimeter (circumference) of the circle using the formula 2 * π * radius.
    * 
    * @return the perimeter of the circle
    */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
    * Scales the radius of the circle by a specified factor.
    * 
    * @param f the factor by which to scale the radius
    */
    public void scale(double f) {
        radius *= f;
    }
}
