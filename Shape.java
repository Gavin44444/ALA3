/**
* Abstract class Shape that uses interfaces java.util Comparable<E>, Cloneable, and self-coded Scaleable
* @author: Gavin Crowley
* @version: 01
*/
public abstract class Shape implements Comparable<Shape>, Cloneable, Scalable {
    //color of the shape
    private String color;

    /**
    * default constructor
    */
    protected Shape() {
        color = "Black";
    }

    /**
    * constructor with one param.
    * 
    * @param c a string of the color
    */
    protected Shape(String c) {
        color = c;
    }

    /**
    * accessor for the color
    * 
    * @return color of the shape
    */
    public String getColor() {
        return color;
    }

    /**
    * mutator for the color
    * 
    * @param c a string of the color
    */
    public void setColor(String c) {
        color = c;
    }

    /**
    * Returns a formatted string representation of the shape color.
    * 
    * @return a string representing the color of the shape
    */
    public String toString() {
        return String.format("%-10s", color);
    }

    /**
    * Abstract method to clone the shape. Must be implemented by subclasses.
    * 
    * @return a cloned copy of the shape
    */
    public abstract Object clone();

    /**
    * Abstract method to calculate the area of the shape. Must be implemented by subclasses.
    * 
    * @return the area of the shape
    */
    public abstract double getArea();

    /**
    * Abstract method to calculate the perimeter of the shape. Must be implemented by subclasses.
    * 
    * @return the perimeter of the shape
    */
    public abstract double getPerimeter();

    /**
    * Abstract method to scale the shape by a given factor. Must be implemented by subclasses.
    * 
    * @param f the factor by which to scale the shape
    */
    public abstract void scale(double f);

    /**
    * Compares two shapes by their area.
    * If the areas are equal, it returns 1. Otherwise, it returns 1 if the current shape has a larger area,
    * and -1 if the current shape has a smaller area.
    * 
    * @param s the shape to compare against
    * @return 1 if the current shape's area is larger or equal, -1 if smaller
    */
    public int compareTo(Shape s) {
        if (this.getArea() == s.getArea()) {
            return 1;
        } else if (this.getArea() > s.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }
}
