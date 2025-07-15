
// Assignment 7: Use do-while loop to Print Sum Until User Enters Zero

import java.util.Scanner;

public class assi7 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum =0;
        do{
            num = sc.nextInt();
          
            sum+=num;


        }while(num!=0);
        System.out.println("SUM " +sum);
        
        
    }
    
}
