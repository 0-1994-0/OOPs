import java.util.Scanner;

public class HundMain {
    public static void main(String[] args) {
        Hund h1 = new Hund("cookie", 3, "yorki", "schwarz");
        Scanner input = new Scanner(System.in);
        System.out.println("Kann Stoeckchen bringen?: ");
        h1.stoeckchenBringen(input.nextBoolean());



        //Hund h1 = new Hund("cookie", 3, "yorki", "schwarz");
        System.out.println(h1.alter + h1.name + h1.farbe + h1.getAlter() + h1.getRasse());


        h1.setAlter(5);
        System.out.println(h1.alter);
        h1.bellen();

    }


}
