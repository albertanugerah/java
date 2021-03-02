public class ForEach {
//    foeach digunakan mengakses data di array
    public static void main(String[] args) {
            String[] array = {
                    "Albert","Anugerah","Putra",
                    "Albrt","tassya"
            };

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("FOR Each");

        for(var name : array){
            System.out.println(name);
        }
    }
}
