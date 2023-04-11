public class Teilnehmer {

    private String name;
    private int alter;
    private String adresse;
   private int counter=0;

    Teilnehmer(String name, int a, String adr) {
        this.name = name;
        this.alter = a;
        this.adresse = adr;
    }

    public void hatFrageGestellt(){
        counter=counter+1;
        counter++;
    }


    public void ausgabeFragenCounter(){
        System.out.println(counter);
    }


    public void teilnehmerInfo(){
        System.out.println(adresse+alter+name);
    }


    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAlter() {
        return alter;
    }

    public int setAlter(int alter) {
        this.alter = alter;
        return alter;
    }

    public String getAdresse() {
        return adresse;
    }

    public String setAdresse(String adresse) {
        this.adresse = adresse;
        return adresse;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
