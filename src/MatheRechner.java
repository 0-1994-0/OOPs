public class MatheRechner {


    public static int addieren(int a, int b) {
        return a + b;
    }

    public static int subtrahieren(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }


    public static double divi(int a, int b) {

        if (a == 0 || b == 0) {
            System.out.println("impossible");
            return 0;
        } else {
            return (double) a / b;
        }
    }
}

