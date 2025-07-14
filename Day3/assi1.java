
// DAY 3 JAVA INTRO


// ASSIGNMENT 1 : SUM OF EVEN ELEMENTS IN ARRAY(for loop + condition)

import java.util.Scanner;
class assi1{
    public static void main(String arg[]){
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        int[] arr= new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();

        }

        
        int sum=0;

        for(int i=0;i<arr.length;i++)  // using  .length it gives the length of the given array
        {
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        
        }
        System.out.println("Sum of even elements :" +sum);
    }
}