
// ASSIGNMENT 4 : PRINT ONLY ELEMENTS GRATER BTHAN A GIVE  NUMBER

public class assi4 {
    public static void main(String arg[]){
        int x =25;
        int[] arr={10,30,20,40,50};
        System.out.print("element grater than " + x + ":");
        //using for-each loop
        for (int num:arr){
            if(num > x){
                System.out.print(num +" ");
            }
        }
    }
    
}
