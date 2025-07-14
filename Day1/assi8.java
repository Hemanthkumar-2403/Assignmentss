
// ASSI : 8 AREA AND PERIMETER OF A RECTANGLE

import java.util.Scanner;
class assi8{
    public static void main(String arg[]){
        Scanner num =new Scanner(System.in);
        System.out.print("Enter length :");
        int len = num.nextInt();
        System.out.print("Enter Breadth :");
        int bre = num.nextInt();
        
        // formula

        int area = len * bre ;
        int perimeter = 2 *(len + bre);

        System.out.println("Area of Rectangle : " + area);
        System.out.println("Perimater of Rectangle :" + perimeter);

         

        }
 }