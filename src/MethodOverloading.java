public class MethodOverloading {
    public static void main(String[] args) {
    sayHello();
    sayHello("Albert");
    sayHello("albert", "anugerah");

    }

    static void sayHello(){
        System.out.println("Hi There");
    }
    static void sayHello(String name){
        System.out.println("Hi " + name);
    }
    static void sayHello(String firstName, String lastName){
        System.out.println("Hi " + firstName + " " + lastName);
    }




}
