
// ASSI : 9 SELECTION STATEMENT -Largest of 3 Numbers

public class assi9 {
    public static void main(String arg[]){
        int a = 15;
        int b= 10;
        int c = 25;

        // if else if  else (selection statement)

        if(a > b && a>c){
            System.out.println("Largest Number :" +a);
        }
        else if (b>a && b>c){
            System.out.println("Largest Number :" + b);
        }
        else{
            System.out.println("Largest Number :" +c);
        }
    }
    
}
