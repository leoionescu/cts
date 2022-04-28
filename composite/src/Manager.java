import java.util.ArrayList;
import java.util.List;

public class Manager implements iAngajat{
    String nume;
    String codAngajat;
    List<iAngajat> subordonati = new ArrayList<>();

    @Override
    public void afisareDetalii() {
        System.out.println(nume);
//        System.out.println(codAngajat);
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

    public String getCodAngajat() {
        return codAngajat;
    }

    public void setCodAngajat(String codAngajat) {
        this.codAngajat = codAngajat;
    }
}
