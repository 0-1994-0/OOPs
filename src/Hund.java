public class Hund {

    String name;
    int alter;
    String rasse;
    String farbe;

    public Hund(String n, int a, String r, String f) {
        this.name = n;
        this.alter = a;
        this.rasse = r;
        this.farbe = f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }


    public void bellen() {
        System.out.println("Wuff Wuff");
    }


    public void stoeckchenBringen(boolean kannHund) {
        if (kannHund == true) {
            System.out.println(name+ "Kann es");
        } else {
            System.out.println(name+"Kann es nicht");
        }
    }
}


