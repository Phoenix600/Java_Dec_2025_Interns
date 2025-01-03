package oopinjava;

class A
{
    Integer x1;

    // Constructor
    public A()
    {
        System.out.println("Class A Constructor Called");
    }

    public A(Integer x1)
    {
        this.x1 = x1;
    }

    public void printData1()
    {
        System.out.println( "Data1 : " + this.x1);
    }
}

class B extends A
{
    // Data Member
    Integer x2;

    // Constructors
    public B()
    {
        super();
        System.out.println("Class B Constructor Called");
    }
    public B(Integer x2)
    {
        this.x2 = x2;
    }
    public void displayData2()
    {
        System.out.println("Data2 : " + this.x2);
    }
}

class C extends B
{
    Integer x3;
    public C()
    {
        super();
        System.out.println("Class C No Argument Constructor Called");
    }

    public C(Integer x3)
    {
        this.x3 = x3;
    }

    public void displayData3()
    {
        System.out.println("Data3: " + this.x3);
    }
}


public class Example9 {
    public static void main(String[] args) {
        C c = new C();

        c.x1 = 12;
        c.x2 = 13;
        c.x3 = 14;

        System.out.println(c.x1 + "..." + c.x2 + "..." + c.x3);
        c.displayData3();
        c.displayData2();
        c.printData1();
    }
}
