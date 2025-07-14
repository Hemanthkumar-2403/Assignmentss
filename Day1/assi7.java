
// ASSI : 7 TEMPERATURE CONVERSION

import java.util.Scanner;
import java.lang.*;
class assi7{
    public static void main(String arg[]){
        Scanner num =new Scanner(System.in);
        System.out.print("Enter a temperature in celsius  value :");
        int tem = num.nextInt(); 
          // here i use int data type   ====> but better to take float or double

        // formula

        double fah = ((tem * 9/5) + 32);
         // here " double" because of decimal points

        System.out.println(" Fahrenheit : " + fah);
        
    
        

        }
 }