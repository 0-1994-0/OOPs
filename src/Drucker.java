public class Drucker {


    public String drucken(String Zeichenkette) {

        return Zeichenkette;
    }

    public int drucken(int ganzenZahl) {

        return ganzenZahl;
    }

    public double drucken(double fließkommaZahl) {

        return fließkommaZahl;
    }

    public void drucken2 (double fließ){
        System.out.println("The number is: "+ fließ);
    }

    public boolean drucken(boolean wert) {

        return wert;
    }

    public void drucken2(boolean value) {
        System.out.println("Boolean value is  : " + value);


    }


    public static void main(String[] args) {

        Drucker d1 = new Drucker();


        System.out.println(d1.drucken(true));
        System.out.println(d1.drucken(4));
        System.out.println(d1.drucken(52.4));
        System.out.println("s");
        d1.drucken2(false);
        d1.drucken2(7.5);

    }


}
