package variablesinjava;

import java.lang.*;

public class Example3 {

    public static void main(String[] args)
    {
        int x = 12;
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        short s1 = 32000;
        System.out.println(Short.BYTES);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        byte b1 = -128;
        System.out.println(Byte.BYTES);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        long l1 = 1212121212121L;
        System.out.println(Long.BYTES);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
