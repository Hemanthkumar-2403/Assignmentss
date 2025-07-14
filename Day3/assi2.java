
//  ASSIGNMENT 2 : COUNT and PRINT ODD NUMBER (while loop + if condition)

public class assi2 {
    public static void main(String arg[]){
        // input values
        int [] arr = {3,6,9,12,15};
        int i =0;
        int count =0;
        

        System.out.print("Odd number :");
        while(i<arr.length){
            if(arr[i]%2!=0){
                System.out.print(arr[i] + " ");
                count++;


            }
        i++;
        }
        //System.out.println();
        System.out.println("\nCount : " + count++);
    }
}
        
