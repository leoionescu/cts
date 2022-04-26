public class Masina implements Automobil{
    private String culoare;

    public Masina(){
        System.out.println("constructor masina");
    }

    @Override
    public void afiseaza() {
        System.out.println("Culoarea masinii este " + culoare);
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
}
