public class RecursiveMethod {

    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(1*2*3*4*5);

        System.out.println(factorialRecrusive(6));
        System.out.println(1*2*3*4*5*6);
        loop(10);

    }

    static int factorialLoop(int value){
        var result = 1;

        for(var counter = 1; counter <= value; counter++){
            result *= counter;
        }
        return result;
    }

    static  int factorialRecrusive(int nilai){
        if(nilai == 1){
            return 1;
        }else {
            return nilai * factorialRecrusive(nilai-1);
        }
    }

    static void loop(int value){
        if (value==0){
            System.out.println("selesai");
        }else {
            System.out.println("Loop "+ value);
            loop(value-1);
        }
    }
}
