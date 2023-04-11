public class Auto {

    String marke;
    String modell;
    int Jahr;
    double geschwindigkeit;

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getJahr() {
        return Jahr;
    }

    public void setJahr(int jahr) {
        Jahr = jahr;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public Auto(String marke, String modell, int jahr, double geschwindigkeit) {
        this.marke = marke;
        this.modell = modell;
        Jahr = jahr;
        this.geschwindigkeit = geschwindigkeit;
    }

    public void gasGeben(double geschw) {
        geschwindigkeit = geschwindigkeit + geschw;
        System.out.println(geschwindigkeit);
    }

    public void bremsen(double geschw) {
        geschwindigkeit = geschwindigkeit - geschw;
        System.out.println(geschwindigkeit);
    }


    public String toString() {
        return "Marke: " + marke + ", Modell: " + modell + ", Jahr: " + Jahr + ",Geschwindigkeit: " + geschwindigkeit;

    }

}