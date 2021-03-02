public class SwitchStatement {
    public static void main(String[] args) {
        var qpi = "B";
        var nilai = "C";
        switch (qpi){
            case "A":
                System.out.println("QPI anda memuaskan");
                break;
            case "B":
                System.out.println("QPI anda Bagus");
                break;
            case "C":
                System.out.println("QPI anda Cukup Bagus");
                break;
            default:
                System.out.println("QPI anda Buruk");
        }
//        lambda
        switch (nilai){
             case "A" -> System.out.println("Wow anda lulus dengan baik");
             case "B","C" -> System.out.println("Anda Lulus");
             case "D" -> System.out.println("Ända tidak lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }
//      switch tanpa yield
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Wow anda lulus dengan baik";
            case "B","C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Ända tidak lulus";
            default -> {
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }
        System.out.println(ucapan);

//        switch dengan yield
        ucapan = switch (nilai){
            case "A" :
                yield "Wow anda lulus dengan baik";
            case "B","C" :
                yield  "Anda Lulus";
            case "D" :
                yield  "Ända tidak lulus";
            default :
                yield "Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan);


    }
}
