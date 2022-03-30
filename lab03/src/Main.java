public class Main {
    public static void main(String[] args) {
        AgentieTurism agentieTurism = AgentieTurism.getInstance();
        agentieTurism.setNume("agentia1");
        agentieTurism.setLocatie("Stefan cel Mare");
        agentieTurism.setNrAngajati(5);
        agentieTurism.adaugareServiciu(new Serviciu());
        System.out.println(agentieTurism);
    }
}
