import java.util.Scanner;

class assi5{
    public static void main(String[] arg){
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter numbers :");
        int num=sc.nextInt();
        int[] arr=new int[num];
        
        System.out.println("Enter the values");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
           // System.out.println(arr[i]+"printing value");
        }


       int sum=0;
       int count =0;
        //System.out.println("printing values are :");
       for(int i=0; i<arr.length; i++){
           // System.out.println(arr[i]);
           if(arr[i]>0){
            sum=sum+arr[i];
            count++;
           }

        }
        System.out.println("average positive number : " + (double)sum/count++);

    }
}