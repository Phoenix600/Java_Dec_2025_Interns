package inputinjava;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1;
        System.out.println("Enter the value of num1 : ");
        num1 = input.nextInt();
        System.out.println(num1);

        System.out.println("Enter the short value : ");
        short sNum1 = input.nextShort();  // 36 // 300 // 40000
        System.out.println(sNum1);

        System.out.println("Enter the byte value : ");
        byte bNum1 = input.nextByte();  // 12 // 140
        System.out.println(bNum1);

        System.out.println("Enter the long value : ");
        long lNum1 = input.nextLong();
        System.out.println(lNum1);

        System.out.println("Enter the float value : ");
        float fNum1 = input.nextFloat(); // 12.121212f
        System.out.println(fNum1);

        System.out.println("Enter the double value : ");
        double dNum1 = input.nextDouble();
        System.out.println(dNum1);

        System.out.println("Enter the boolean value :");
        boolean isFlagOpen = input.nextBoolean();
        System.out.println(isFlagOpen);

    }

}
