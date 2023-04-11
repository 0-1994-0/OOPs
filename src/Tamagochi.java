public class Tamagochi {

    int x=0;
    int y=0;
    int f = 1;

    public void bewegen(String richtung) {

        if (f < 1) {
            System.out.println("please futtern");
            return;
        } else if (richtung.toLowerCase().equals("links")) {
            x = x - 1;
        } else if (richtung.toLowerCase().equals("unten")) {
            y = y - 1;
        }
        f = f - 1;
        System.out.println("x "+ x+ " y "+y + " f " +f);
    }



    public void futtern(int f) {
        this.f = this.f + f;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getF() {
        return f;
    }

    public void koordinatenSetzen(int xneu, int yneu) {

        this.x = xneu;
        this.y = yneu;

    }

    public static void main(String[] args) {

        Tamagochi t1 = new Tamagochi();

        t1.futtern(8);
        //t1.futtern(5);
        t1.koordinatenSetzen(6, 4);

        int futterstand = t1.getF();
        System.out.println(futterstand);
        for (int i = 0; i < futterstand; i++) {
            if (t1.getX() != 0) {
                t1.bewegen("Links");
            }
            if (t1.getY() != 0) {
                t1.bewegen("Unten");
            }
        }

    }

}
