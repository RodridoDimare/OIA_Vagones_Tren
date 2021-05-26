import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Archivo {
    private int cantidadAnimales = 0;
    private int agresividad = 0;
    private LinkedList<Animal> animales;
    private File x;

    public LinkedList<Animal> Lectura() throws FileNotFoundException {
        animales = new LinkedList<Animal>();
        Scanner entrada = new Scanner(x);

        if(entrada.hasNext())
                this.cantidadAnimales =entrada.nextInt();

        if(entrada.hasNext())
                this.agresividad =entrada.nextInt();
        entrada.nextLine();
        while(entrada.hasNext())

        {
            String aux = entrada.nextLine();
            String [] arrayAux = aux.split(" ");
            animales.add(new Animal(arrayAux[0],Integer.parseInt(arrayAux[1])));

        }

                entrada.close();
                return animales;
    }

    public void grabarTren(String archivo,int vagones ,int agresividad){

        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);
            pw.println(vagones+ " " + agresividad);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fichero != null)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public Archivo(String archivo) throws FileNotFoundException{
        this.x  = new File(archivo);

    }

    public int getAgresividad() {
        return agresividad;
    }
}
