public class DataTypeArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];

        arrayString[0]= "Albert";
        arrayString[1]= "Anugerah";
        arrayString[2]= "Putra";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

//        Array initializer
        String[] fullName = {
                "Albert","Anugerah","Putra"
        };
        fullName[0] = null;

        int[] arrayInt = new int[]{
                31,12,19,92
        };

        long[] arrayLong = { 10L,15L,20L };
        arrayLong[0] =0;

        System.out.println(arrayLong.length);

//        Array didalam Array
        String[][] members = {
                {"Albert","Anugerah","Putra"},
                {"Tassha","Inda","irfani"},
                {"Joko","Widodo"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
}
