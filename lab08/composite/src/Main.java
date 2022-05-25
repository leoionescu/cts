public class Main {
    public static void main(String[] args) {
        Angajat a1 = new Angajat();
        a1.setNume("a1");
        a1.setCodAngajat("0");
        Angajat a2 = new Angajat();
        a2.setNume("a2");
        a2.setCodAngajat("1");

        Manager m1 = new Manager();
        m1.setNume("m1");
        m1.setCodAngajat("2");
        Manager m2 = new Manager();
        m2.setNume("m2");
        m2.setCodAngajat("3");

        Departament departament = new Departament();
        departament.setNume("d1");

        m1.adaugaSubordonat(a1);
        m1.adaugaSubordonat(a2);
        m1.afisareDetalii();

        departament.adaugaSubordonat(a2);
        departament.adaugaSubordonat(m1);
        departament.afisareDetalii();
    }
}
