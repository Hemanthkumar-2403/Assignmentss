
// ASSI : 4  EXPLIXT TYPE CASTING

public class assi4 {
    public static void main(String arg[]){
        float f =123.456f;  // why f in last because Java thinks it is either float or double ===> So we give clarity ,so mention 'f' it is FLOAT. 

        // type casting

        int i = (int)f;   // type casting ===> float to  int and float to byte  (removes decimal points)
        byte b = (byte)f;

        System.out.println("To int : " +i);
        System.out.println("To Byte : " + b);
    }
    
}
