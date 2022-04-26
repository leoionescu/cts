import java.util.HashMap;
import java.util.Map;

public class MasinaFactory {
    private static Map<String, Masina> map = new HashMap();

    public static Masina creaazaMasina(String culoare) {
        if(map.get(culoare) == null) {
            Masina masina = new Masina();
            masina.setCuloare(culoare);
            map.put(culoare, masina);
        }
        return map.get(culoare);
    }
}
