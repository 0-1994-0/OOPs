public class Rechteck {

    private double breite ;
    private double hoehe;

    public Rechteck(double breite, double hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getArea(){
        double area = breite*hoehe;
        //System.out.println(area);
        return area;
    }

    public double getPerimeter (){
        double perimeter = 2*(breite+hoehe);
        //System.out.println(perimeter);
        return perimeter;
    }

}
