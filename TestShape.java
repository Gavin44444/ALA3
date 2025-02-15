/**
* class TestShpae that is used to create a test shapes
* @author: Gavin Crowley
* @version: 01
*/
public class TestShape {
    /**
    * Main method that will be used to create different shapes, compare them, and sort them
    * 
    * @param args 
    */
    public static void main(String[] args) {
        // Initialize an array of Shape objects
        Shape[] shapes = new Shape[8];
        shapes[0] = new Circle("Black", 2.5);
        shapes[1] = new Triangle("Green", 6.0, 6.0, 6.0);
        shapes[2] = new Rectangle("Red", 5.0, 3.0);
        shapes[3] = new Pentagon("Yellow", 7.0);
        shapes[4] = (Shape) (shapes[0].clone()); // Cloning the circle
        shapes[5] = (Shape) (shapes[1].clone()); // Cloning the triangle
        shapes[6] = (Shape) (shapes[2].clone()); // Cloning the rectangle
        shapes[7] = (Shape) (shapes[3].clone()); // Cloning the pentagon

        // Modifying some of the shapes
        shapes[4].scale(2.0); // Scaling the cloned circle
        shapes[5].setColor("Orange"); // Changing the color of the cloned triangle
        ((Rectangle) shapes[6]).setLength(10.0); // Changing the length of the cloned rectangle
        ((Pentagon) shapes[7]).setside(4.0); // Changing the side length of the cloned pentagon

        // Display shapes before sorting
        System.out.println("Before sorting");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        // Sort shapes by their area
        java.util.Arrays.sort(shapes);
        System.out.println();
        System.out.println("After sorting");
        System.out.println();
        for (Shape s : shapes) {
            System.out.println(s);
        }

        // Calculate and display the average perimeter of the shapes
        double averagePerimeter = getAveragePerimeter(shapes);
        System.out.printf("\n\nAverage Perimeter = %.2f\n", averagePerimeter);
    }

    /**
    * Calculates the average perimeter of an array of Shape objects.
    *
    * @param list an array of Shape objects
    * @return the average perimeter of the shapes in the array
    */
    public static double getAveragePerimeter(Shape[] list) {
        double totalPerimeter = 0;
        for (Shape shape : list) {
            totalPerimeter += shape.getPerimeter();
        }
        return totalPerimeter / list.length;
    }
}
