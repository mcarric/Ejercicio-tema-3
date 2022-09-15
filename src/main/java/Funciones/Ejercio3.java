package Funciones;

public class Ejercio3 {
    public static void main(String[] args) {
        int resultado;
        resultado = fxsuma(10,15,20);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.agregarpuerta();

        System.out.println(miCoche.puertas);


    }

    public static int fxsuma(int a, int b, int c) {
        return a + b + c;


    }
}
class Coche {
    public int puertas = 4;

    public void agregarpuerta() {
        this.puertas++;
    }
}
