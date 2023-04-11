import java.util.Scanner;

public class KatzeMain {
    public static void main(String[] args) {

        Katze katze1 = new Katze("cookie", 7, "chat");
        Katze katze2 = new Katze("sisi", 5, "WW");
        katze1.knurren();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie heißt der Hunde? ");
        String hund = scanner.next();

        //Hund hund2 = new Hund("Foxy", 4, "no", "nichts");
        katze1.wegLaufen(hund);

        System.out.println(katze1.getAlter() + katze1.getRasse() + katze1.getName());
        katze2.wegLaufens();
    }


}
