package oopinjava;

// Parent Class
class Class1
{
    int x1 = 12;
    public void method1()
    {
        System.out.println("Method-1 of class-1");
    }
}

// Derived Class
class Class2 extends Class1
{
    int x2 = 13;
    public void method2()
    {
        System.out.println("Method-2 of Class2");
    }
}

// Derived Class
class Class3 extends Class2
{
    int x3 = 14;
    public void method3()
    {
        System.out.println("Method-3 of Class-3");
    }
}


public class Example13 {
    public static void main(String[] args) {
        Class1 class1 = new Class1();

        System.out.println(class1.x1);
        class1.method1();

        Class2 class2 = new Class2();

        System.out.println(class2.x1);
        System.out.println(class2.x2);

        class2.method1();
        class2.method2();

        Class3 class3 = new Class3();
        System.out.println(class3.x1);
        System.out.println(class3.x2);
        System.out.println(class3.x3);
        class3.method1();
        class3.method2();
        class3.method3();


        Class1 parent1 = new Class3();
        System.out.println(parent1.x1);
        parent1.method1();

        Class2 parent2 = new Class3();

        System.out.println(parent2.x2);
        System.out.println(parent2.x1);

        parent2.method1();
        parent2.method2();

    }
}
