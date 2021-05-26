import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Tren {
    private List<Animal> animales;
    private int cantVagones = 0;

    public Tren(LinkedList<Animal> animales){
        this.animales = animales;
    }

    public int contabilizarVagones(int agresividadPermitida){
        int agresividad = 0;
        Collections.sort(animales);
        for (int i = 0; i < animales.size(); i++) {
            int j=i+1;
            while(animales.size() > j && (Math.abs(animales.get(i).getAgresividad()-animales.get(j).getAgresividad()))<=agresividadPermitida){
                j++;
            }
            cantVagones++;
            //i=--j;
            if(i != --j){
                agresividad += Math.abs(animales.get(i).getAgresividad()-animales.get(j).getAgresividad());
                agresividadPermitida -= agresividad;
            }
            i=j;
        }
        return agresividad;
    }

    public int getCantVagones() {
        return cantVagones;
    }
}
