
// ASSI : 6 BITWISE XOR SWAP

import java.util.Scanner;
class assi6{
    public static void main(String arg[]){
        Scanner num =new Scanner(System.in);
        System.out.print("Enter i  value :");
        int i = num.nextInt();
        System.out.print("Enter j value:");
        int j = num.nextInt();

        System.out.println("Before Swaping : i =" + i + ",j="+j);

        // Swaping with XOR

        i= i ^ j;
        j= i ^ j;
        i = i ^ j;

        System.out.println("After Swaping : i =" + i + ",j="+j);




        }
 }