
// ASSI 2 : SIGNED vs UNSIGNED RIGHT SHIFT

class assi2{
    public static void main(String arg[]){
        int a = -8;
        // signed right shift
        int signedshift = a >> 2;
        int unsignedshift = a>>> 2;

        System.out.println("Signed (-8 >> 2) :" + signedshift);
        System.out.println("Unsigned (-8 >>> 2) :" + unsignedshift);


    }
}
    

