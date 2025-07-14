
// ASSI : 11 SEQUENTIAL STATEMENT -BMI Calculator

import java.util.Scanner;
class assi11{
    public static void main(String arg[]){
        Scanner num = new Scanner(System.in);
        System.out.print("Weight:");
        float weight =num.nextFloat();
        System.out.print("Height:");
        float height=num.nextFloat();
        // formula
        double bmi = weight/(height * height);
        System.out.println("BMI =" +bmi);

        System.out.printf("BMI = %.2f" , bmi);   // printf ==> "print formatted" =======> format control it supports format specifier (eg   %d,%.2f,%s)
    }
}