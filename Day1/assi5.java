
// ASSI : 5 SWAP TWO NUMBERS WITHOUT THIRD VARIABLE

import java.util.Scanner;
class assi5{
    public static void main(String arg[]){
        Scanner num =new Scanner(System.in);
        System.out.print("Enter i  value :");
        int i = num.nextInt();
        System.out.print("Enter j value:");
        int j = num.nextInt();

        System.out.println("Befor swap : i =" + i + ", b = " + j );

        // swaping a number (arthimatic + -)

        i = i + j;
        j = i - j;
        i = i - j;

        System.out.println("after swap : i =" + i + ", b = " + j );


    }
}