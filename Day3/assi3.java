
//ASSIGNMENT 3 : FIND LARGEST ELEMENT ABD CHECK if it'S odd OR even

public class assi3 {
    public static void main(String arg[]){
        int[] arr={10,23,45,89,76};
        int max= arr[0];  // arr[0]==> 10
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(" Maximum Elements is : " + max);
        // if else
        if(max%2==0){
            System.out.println("It is a Even Number ");

        }
        else{
            System.out.println("It is a Odd Number");
        }


    }
    
}
