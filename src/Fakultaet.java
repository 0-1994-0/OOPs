public class Fakultaet {


    public static void main(String[] args) {
        int faku = recursion(5);
        System.out.println(recursion(5));
        System.out.println(faku);
        fibo();

    }

    public static int recursion(int zahl) {

        if (zahl == 0) {
            return 1;
        } else {
            return zahl * recursion(zahl - 1);
        }
    }


    public static void fibo() {

        long davor = 0;
        long aktuell = 1;
        long fibona = 20;

        for (int i = 0; i < fibona; i++) {
            System.out.println(aktuell);
            long next = davor + aktuell;
            davor = aktuell;
            aktuell = next;

        }



    }

}

