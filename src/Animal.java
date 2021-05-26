public class Animal implements Comparable<Animal>{
    private String nombre;
    private int agresividad;

    public Animal(String nombre,int agresividad){
        this.agresividad = agresividad;
        this.nombre = nombre;
    }

    public int getAgresividad() {
        return agresividad;
    }


    @Override
    public int compareTo(Animal animal) {
        if (this.agresividad < animal.agresividad) {
            return -1;
        }
        if (this.agresividad > animal.agresividad) {
            return 1;
        }
        return 0;
    }

}
