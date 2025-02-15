/**
* class Triangle that inherits from abstract class Shape
* @author: Gavin Crowley
* @version: 01
*/
public class Triangle extends Shape {
    //vars for the 3 sides of the triangle
    private double side1;
    private double side2;
    private double side3;

    /**
    * Default constructor
    */
    public Triangle() {
        super();
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    /**
    * Constructor with four params.
    * 
    * @param color the color of the triangle
    * @param side1 the length of the first side
    * @param side2 the length of the second side
    * @param side3 the length of the third side
    */
    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
    * accessor for the length of the first side.
    * 
    * @return the length of the first side
    */
    public double getside1() {
        return side1;
    }

    /**
    * mutator for the length of the first side.
    * 
    * @param s1 the new length of the first side
    */
    public void setside1(double s1) {
        side1 = s1;
    }

    /**
    * accessor for the length of the second side.
    * 
    * @return the length of the second side
    */
    public double getside2() {
        return side2;
    }

    /**
    * mutator for the length of the second side.
    * 
    * @param s2 the new length of the second side
    */
    public void setside2(double s2) {
        side2 = s2;
    }

    /**
    * accessor for the length of the third side.
    * 
    * @return the length of the third side
    */
    public double getside3() {
        return side3;
    }

    /**
    * mutator for the length of the third side.
    * 
    * @param s3 the new length of the third side
    */
    public void setside3(double s3) {
        side3 = s3;
    }

    /**
    * Returns a formatted string representation of the Triangle object.
    * Includes the shape name, color, side lengths, area, and perimeter.
    * 
    * @return formatted string with triangle details
    */
    public String toString() {
        return String.format("%-10s\t%-10s\t%-5.2f\t%-5.2f\t%-5.2f\t%-5.2f\t%-5.2f", 
            "Triangle", super.toString(), side1, side2, side3, getArea(), getPerimeter());
    }

    /**
    * Calculates and returns the area of the triangle.
    * 
    * @return the area of the triangle
    */
    public double getArea() {
        // Using Heron's formula would be more accurate for all triangles,
        // but assuming right triangle for the current calculation.
        return (side1 * side2) / 2;
    }

    /**
    * Calculates and returns the perimeter of the triangle.
    * 
    * @return the perimeter of the triangle
    */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**
    * makes a clone of the current Triangle object.
    * 
    * @return a cloned Triangle object
    */
    public Object clone() {
        return new Triangle(this.getColor(), side1, side2, side3);
    }

    /**
    * Scales the sides of the triangle by a given factor.
    * 
    * @param f the factor by which to scale the sides
    */
    public void scale(double f) {
        side1 *= f;
        side2 *= f;
        side3 *= f;
    }
}
