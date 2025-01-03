package oopinjava;

class GeometricFigures
{

    public GeometricFigures()
    {
        System.out.println("GeometricFigures Constructor");
    }

    public void print()
    {
        System.out.println("Geometric Figure");
    }
}

class TwoDimensionalFigure extends GeometricFigures
{
    int numberOfSides;

    public TwoDimensionalFigure()
    {
        System.out.println("TwoDimensionalFigure Constructor");
    }

    public void print()
    {
        super.print(); // calling parent's print() method, means method of GeometricFigures class
        System.out.println("Two Dimensional Figure");
    }
}

class Rectangle extends TwoDimensionalFigure
{
    public Rectangle()
    {
        super(); // creating parent object before child
        System.out.println("Rectangle Constructor");
    }

    public void print()
    {
        super.print(); // calling parent's print() method, means method of TwoDimensionalFigure class
        System.out.println("Rectangle Figure");
    }
}

class Circle extends TwoDimensionalFigure
{
    public Circle()
    {
        super(); // creating parent object before child
        System.out.println("Circle Constructor");
    }
    public void print()
    {
        super.print(); // calling parent's print() method, means method of TwoDimensionalFigure class
        System.out.println("Circle Figure");
    }
}

public class Example10 {

    public static void main(String[] args) {

        System.out.println("Creating Rectangle Class Object");
        Rectangle rectangle = new Rectangle();
        rectangle.numberOfSides = 4;
        rectangle.print();
        System.out.println("Sides : " + rectangle.numberOfSides);

        System.out.println("Creating Circle Class Object");
        Circle circle = new Circle();

        circle.numberOfSides = 0;
        circle.print();
        System.out.println("Sides : " + circle.numberOfSides);
    }
}
