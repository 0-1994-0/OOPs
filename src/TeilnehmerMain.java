public class TeilnehmerMain {

    public static void main(String[] args) {


        Teilnehmer t1=new Teilnehmer("Aurelie ", 28," Krenngasse 41/60");
        Teilnehmer t2= new Teilnehmer("Manuel ", 33, " Krenngasse 41/6");


        t1.teilnehmerInfo();
        String adresse= t1.getAdresse();
        System.out.println(adresse);
        String andereAdresse = t1.setAdresse("Herrengasse");
        int neuAlter = t1.setAlter(35);
        System.out.println(t1.getName()+ " "+ t1.getAlter()+" "+ t1.getAdresse()+" " + andereAdresse + " " + neuAlter);
        t2.setName("Mani");
        System.out.println(t2.getName());
        t2.teilnehmerInfo();
        String vorname=t2.getName();
        t2.setAlter(2);
        t2.teilnehmerInfo();
        System.out.println(t2.getAlter());
        t2.setAlter(85);
        System.out.println(t2.getAlter());
        System.out.println(vorname);
        t1.hatFrageGestellt();
        t1.hatFrageGestellt();
        t1.hatFrageGestellt();
        t1.ausgabeFragenCounter();
        t2.teilnehmerInfo();
        t2.hatFrageGestellt();
        t2.ausgabeFragenCounter();
    }
}
