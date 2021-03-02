public class ConversionNumber {
    public static void main(String[] args) {
 /*     Konversi Tipe Data Number
       Widening Casting (Otomatis)
         byte->short->int->long->float->double

         Narrow Casting (manual)
         double->float->long->int->char->short->byte
*/
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000;
        byte iniByte2 =(byte) iniInt2;

    }
}
