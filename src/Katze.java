public class Katze {

    private String name;
    private int alter;
    private String rasse;


    public Katze(String name, int alter, String rasse) {
        this.name = name;
        this.alter = alter;
        this.rasse = rasse;
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

    public void knurren() {
        System.out.println("knurr");
    }
    //Hund hund2 = new Hund("Foxy",4,"no","nichts");

        public void wegLaufens() {

            Hund hund3 = new Hund("FOXY", 4, "bnm", "braun");
            Hund hund4 = new Hund("FOXY", 5, "ww", "grau");

            if (hund3.getName().toLowerCase().equals("foxy")) {
                System.out.println("Alles gut, ist nur " + hund3.getName());
            } else {
                System.out.println(hund4.getName()+"weglaufen!");
            }
        }
    public void wegLaufen(String hund2) {

        if (hund2.toLowerCase().equals("foxy")) {
            System.out.println("Alles gut");
        } else {
            System.out.println("weglaufen");
        }

    }

}

