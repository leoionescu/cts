public class Main {
    public static void main(String[] args) {
        Masina masinaGalbena = MasinaFactory.creaazaMasina("galben");
        Masina masinaRosie = MasinaFactory.creaazaMasina("rosu");
        Masina masinaVerde = MasinaFactory.creaazaMasina("verde");
        Masina masinaGalbena1 = MasinaFactory.creaazaMasina("galben");

        masinaGalbena.afiseaza();
        masinaRosie.afiseaza();
        masinaVerde.afiseaza();
        masinaGalbena1.afiseaza();
    }
}
