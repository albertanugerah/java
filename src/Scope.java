public class Scope {
    public static void main(String[] args) {
        sayHello("Albert");
        sayHello("");
    }

    static void sayHello(String name){
        String hello = "hello " + name;

        if(!name.isBlank()){
            String hi = "Hi "+ name ;
            System.out.println(hi);
        }

        System.out.println(hello);
    }
}
