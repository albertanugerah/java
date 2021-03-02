public class MethodVariableArgument {
    public static void main(String[] args) {

        sayCongrats("Albert", 50, 50, 50);
        sayCongrats("Tassya", 80,70,90);

    }

    //    dengan varibale argument
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " Anda Lulus");
        } else {
            System.out.println("Maaf " + name + " Anda Belum Lulus");
        }

    }

//    tanpa variable argument
//    static void sayCongrats(String name,int[] values){
//        var total = 0;
//        for(var value : values){
//            total += value;
//        }
//        var finalValue = total /values.length;
//
//        if(finalValue >= 75){
//            System.out.println("Selamat " + name + " Anda Lulus");
//        }else {
//            System.out.println("Maaf " + name + " Anda Belum Lulus");
//        }
//    }
//}

}