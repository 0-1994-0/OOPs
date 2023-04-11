public class MatheRechnerMain {

    public static void main(String[] args) {

        int a =5;
        int b=10;

        int ad = MatheRechner.addieren(a,b);
        int sub = MatheRechner.subtrahieren(a,b);
        double dividi = MatheRechner.divi(a,b);
        int multipli = MatheRechner.multi(a,b);


        System.out.println(ad+ " " + sub+ " "+ dividi+ " "+ multipli+ " ");


        System.out.println(MatheRechner.addieren(10,5));
        System.out.println(MatheRechner.subtrahieren(10,5));
        System.out.println(MatheRechner.divi(10,5));
        System.out.println(MatheRechner.multi(10,5));
    }
}
