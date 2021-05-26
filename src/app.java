import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class app {
    public static void main(String[] args) {
        int agresividadPermitida = 0;
        LinkedList<Animal> animales = null;
        try {
            Archivo archivo = new Archivo("vagones.in");
            animales = archivo.Lectura();
            Tren tren = new Tren(animales);
            int agresividad;
            agresividad = tren.contabilizarVagones(archivo.getAgresividad());
            archivo.grabarTren("vagones.out",tren.getCantVagones(),agresividad);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
