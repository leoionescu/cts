public class Angajat implements iAngajat{
    String nume;
    String codAngajat;

    @Override
    public void afisareDetalii() {
        System.out.println(nume);
//        System.out.println(codAngajat);
    }

    @Override
    public void adaugaSubordonat(iAngajat angajat) {

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
