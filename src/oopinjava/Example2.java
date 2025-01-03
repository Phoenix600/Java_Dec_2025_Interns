package oopinjava;

class Person
{
    String name;
    Integer age;
    String gender;
    Float height;
    Float weight;

    // No-Argument Constructor
    Person()
    {
        System.out.println("Person Constructor Called");
    }

    // All Argument Constructor
    Person(String name, Integer age,
           String gender, Float height,
           Float weight)
    {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
        this.height = height;

    }


    void printPersonDetails()
    {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
    }
}


public class Example2 {
    public static void main(String[] args)
    {
        // int x = 12;
        Person p1 = new Person();
        p1.printPersonDetails();

        Person p2 = new Person("Gandhar",42,"MALE",190.5f,85.68f);
        p2.printPersonDetails();
    }
}
