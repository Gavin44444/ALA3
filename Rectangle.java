/**
* class Rectangle that inherits from abstract class Shape
* @author: Gavin Crowley
* @version: 01
*/
public class Rectangle extends Shape {
    private double length;
    private double width;

    /**
    * default constructor
    */
    public Rectangle() {
        super();
        length = 1.0;
        width = 1.0;
    }

    /**
    * constructor with three params.
    * 
    * @param color the color of the rectangle
    * @param length the length of the rectangle
    * @param width the width of the rectangle
    */
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    /**
    * accessor for the length
    * 
    * @return length of the rectangle
    */
    public double getLength() {
        return length;
    }

    /**
    * mutator for the length
    * 
    * @param l length of the rectangle
    */
    public void setLength(double l) {
        length = l;
    }

    /**
    * accessor for the width
    * 
    * @return width of the rectangle
    */
    public double getwidth() {
        return width;
    }

    /**
    * mutator for the width
    * 
    * @param w width of the rectangle
    */
    public void setwidth(double w) {
        width = w;
    }

    /**
    * Returns a string representation of the rectangle, including its color, length, width,
    * area, and perimeter.
    * 
    * @return a formatted string representing the rectangle's details
    */
    public String toString() {
        return String.format("%-10s\t%s\t%-10.2f\t%-10.2f", "Rectangle", super.toString(), length, width, getArea(), getPerimeter());
    }

    /**
    * Calculates the area of the rectangle.
    * 
    * @return the area of the rectangle
    */
    public double getArea() {
        return length * width;
    }

    /**
    * Calculates the perimeter of the rectangle.
    * 
    * @return the perimeter of the rectangle
    */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
    * Creates a deep copy (clone) of the rectangle.
    * 
    * @return a cloned instance of the rectangle
    */
    public Object clone() {
        return new Rectangle(this.getColor(), length, width);
    }

    /**
    * Scales the rectangle by a specified factor.
    * 
    * @param f the factor by which to scale the rectangle
    */
    public void scale(double f) {
        length *= f;
        width *= f;
    }
}
