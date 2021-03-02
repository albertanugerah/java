public class DataTypeNotPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

//        konversi dari primitif ke bukan primitif

        int iniInt = 100;
        Integer iniObject = iniInt;

        int  age = 28;
        Integer ageObject = age;

        int ageAgain = ageObject;

//        konversi dari Bukan primitif ke primitif
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 10000L;




    }

}
