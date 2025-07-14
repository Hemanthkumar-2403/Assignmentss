
// ASSIGNMENT 4 : PRE/POST INCREMENT-DECREMENT CHECK

import java.util.Scanner;
class assi4{
    public static void main(String arg[]){
        Scanner num =new Scanner(System.in);
        System.out.println("Enter a  number :");
        int i = num.nextInt();

        System.out.println(" Original number : " + i);

        //pre increment (++i)

        int prein = ++i;
        System.out.println("Pre increment : " + prein);
        // post increment(i++)
        int postin=i++;
        System.out.println("post increment :" + postin +" , then becomes " + i );


        // pre decrement(--i)
        int prede=--i;
        System.out.println("Pre Decrement : " + prede);
        // post decrement(i--)
        int postde=i--;
        System.out.println("post decrement: "  + postde + " ,then becomes " + i);
    }
}