import java.util.Scanner;

public class RechteckMain {

    public static void main(String[] args) {


        Rechteck r1 = new Rechteck(5,7);
        Rechteck r2 = new Rechteck(9,20);

        //System.out.println(r1.getBreite());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        r1.setBreite(7);
        r1.setHoehe(70);
        System.out.println(r1.getPerimeter());

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter eine Breite : ");
        r1.setBreite(input.nextDouble());

        System.out.println("Please enter eine Höhe : ");
        r1.setHoehe(input.nextDouble());

        System.out.println(r1.getPerimeter()+ " "+ r1.getArea());


    }
}
