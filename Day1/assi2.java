
// ASSIGNMENT 2 : OPERATOR EVALUATION


import java.util.Scanner;
public class assi2{
    public static void main(String arg[]){
        Scanner num =new Scanner(System.in);
        System.out.println("Enter first number :");
        int i = num.nextInt();
        System.out.println("Enter second number :");
        int j = num.nextInt();

        // Artimatic operator
        System.out.println("Addition :" + (i+j));
        System.out.println("Substration :" + (i-j));
        System.out.println("Multiplication :" +(i*j));
        System.out.println("Division :" +(i / j));
        System.out.println("Modulus :" +(i % j));

        // Realational operator
        System.out.println("Grater than :" + (i>j));
        System.out.println("Less than :" + (i<j));
        System.out.println("Equal to :" + (i==j));

        // Logical operator
        System.out.println("Logical AND (i>10 && j<0) :" + (i>10 && j<0));
        System.out.println("Logical OR (i>10 || j<0) :" + (i>10 || j<0));
        System.out.println("Logical AND (i>10 != j<0) :" + (i>10 != j<0));

        //Bitwise operatoe
        System.out.println("Bitwise AND (i & j) : " + (i & j));
        System.out.println("Bitwise OR (i | j) : " + (i | j));
        System.out.println("Bitwise right shift (i>>2) : " + (i>>2));     // right shift
        System.out.println("Bitwise left shift(j<<2) : " + ( j<<2));    //lift shift

    

    }
}