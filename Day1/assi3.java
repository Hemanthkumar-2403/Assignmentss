
//ASSIGNMENT 3 : TERNARY OPERATOR 

import java.util.Scanner;
class assi3{
    public static void main(String arg[]){
        Scanner num =new Scanner(System.in);
        System.out.println("Enter a Integer number :");
        int i=num.nextInt();
        String j= (i%2==0 )? " Even number " :  " Odd number ";
        System.out.println("The number " + i +" is"  + j);
    }
}