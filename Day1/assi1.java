
// JAVA DAY1 INTRO

//ASSIGNMENT 1 : BASIC DATA TYPES AND RANGES CHECKER


import java.util.Scanner;
class assi1{
    public static void main(String arg[])
    {
    Scanner check = new Scanner(System.in);     // "check" is nothing but name of the object is used to take input from the keyword

    System.out.println("Enter a Byte value :");
    byte b = check.nextByte();
    System.out.println("Enter a Short value :");
    short s = check.nextShort();
    System.out.println("Enter a Int value :");
    int i = check.nextInt();
    System.out.println("Enter a Long value :");
    long l = check.nextLong();
    System.out.println("Enter a Float value :");
    float f = check.nextFloat();
    System.out.println("Enter a Double value :");
    double d = check.nextDouble();

    System.out.println(" The final OUTPUT is: ");

    System.out.println("Byte :" + b + " ,Range :" + Byte.MIN_VALUE + "to" + Byte.MAX_VALUE);
    System.out.println("Short :" + s + ",Range :" + Short.MIN_VALUE + "to" + Short.MAX_VALUE);
    System.out.println("Int :" + i + " ,Range :" + Integer.MIN_VALUE + "to" + Integer.MAX_VALUE);
    System.out.println("Long :" + l + " ,Range :" + Long.MIN_VALUE + "to" + Long.MAX_VALUE);
    System.out.println("Float :" + f + " ,Range :" + Float.MIN_VALUE + "to" + Float.MAX_VALUE);
    System.out.println("Double :" + d + " ,Range :" + Double.MIN_VALUE + "to" + Double.MAX_VALUE);


    }
}