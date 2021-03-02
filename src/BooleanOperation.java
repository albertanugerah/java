public class BooleanOperation {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 90;

        boolean lulusAbsen = absen >= 70;
        boolean lulusNilai = nilaiAkhir >= 80;

        var lulus = lulusAbsen && lulusNilai;
        if (lulus){
            String selamat = "Selamat Anda Lulus";
            System.out.println(selamat);
        }else{
            String selamat = "Maaf anda belum lulus";
            System.out.println(selamat);
        }

    }
}
