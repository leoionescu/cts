import java.util.ArrayList;

public class AgentieTurism {
    private static AgentieTurism instance;
    private String nume;
    private String locatie;
    private int nrAngajati;
    private ArrayList<Serviciu> servicii = new ArrayList<>();
    private AgentieTurism() {
    }

    public static synchronized AgentieTurism getInstance(){
        if(instance == null) {
            instance = new AgentieTurism();
        }
        return instance;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public ArrayList<Serviciu> getServicii() {
        return servicii;
    }

    public void adaugareServiciu(Serviciu serviciu) {
        this.servicii.add(serviciu);
    }

    @Override
    public String toString() {
        return "AgentieTurism{" +
                "nume='" + nume + '\'' +
                ", locatie='" + locatie + '\'' +
                ", nrAngajati=" + nrAngajati +
                ", servicii=" + servicii +
                '}';
    }
}
