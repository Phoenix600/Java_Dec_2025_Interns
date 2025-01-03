package oopinjava;


class MyCircle
{
   int radius;

    public MyCircle() {
        System.out.println("Parent Constructor Called");
    }

    public MyCircle(int radius) {

        this.radius = radius;
    }

    public float perimeter()
    {
        return  3.14f * 2 * this.radius;
    }

    public float area()
    {
        return 3.14f * this.radius * this.radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "radius=" + radius +
                '}';
    }
}

class MyCylinder extends MyCircle
{
    float height;
    // constructors

    public MyCylinder() {
        System.out.println("Child Constructor Called...");
    }

    public MyCylinder(int radius, float height) {
        super(radius);
        this.height = height;
    }

    // methods
    float volume()
    {
        return 3.14f * this.radius * this.radius * this.height;
    }

    @Override
    public float perimeter() {
        return 2*((2* this.radius) + this.height);
    }

    // getter and setters

    // toString

}


public class Example6 {
    public static void main(String[] args) {

        // Inheritance Requires At least two classes
        // extends' keyword is used for inheritance
        // before child, its parent is created
        MyCylinder c1 = new MyCylinder();


        // Parent Class's Object
        MyCircle circle1 = new MyCircle();
        System.out.println(circle1.radius);
        circle1.radius = 100;
        System.out.println(circle1.radius);

        //  Object of Child Class
        MyCylinder cylinder1 = new MyCylinder(10,100f);
        System.out.println(cylinder1.radius);
        System.out.println(cylinder1.height);

        float vol = cylinder1.volume();  // 2*(2r + h)
        System.out.println("Volume " + vol);
        System.out.println("Perimeter : " + cylinder1.perimeter());

    }
}
