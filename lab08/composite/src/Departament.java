import java.util.ArrayList;
import java.util.List;

public class Departament implements iAngajat{
    String nume;
    List<iAngajat> subordonati = new ArrayList<>();


    @Override
    public void afisareDetalii() {
        System.out.println(nume);
        for(iAngajat s : subordonati) {
            s.afisareDetalii();
        }
    }

    @Override
    public void adaugaSubordonat(iAngajat angajat) {
        subordonati.add(angajat);
    }

    @Override
    public void stergeSubordonat(iAngajat angajat) {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
