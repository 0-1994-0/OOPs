public class AutoTest {
    public static void main(String[] args) {
        Auto auto= new Auto("Toyota", "Camry", 2018, 0);
        Auto auto1 = new Auto("VW", "Touran", 2011, 45);



        auto.bremsen(4);
        System.out.println(auto1.toString());
        System.out.println(auto.toString());
        auto1.bremsen(1);
        auto.gasGeben(80);
        auto1.gasGeben(90);


    }
}
