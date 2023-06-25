package herenciaEjExtra1.main;

import herenciaEjExtra1.entidades.Barco;
import herenciaEjExtra1.entidades.ServicioAlquiler;
import java.util.ArrayList;
import java.util.Scanner;

public class HerenciaEjExtra1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Barco> barcos = new ArrayList();
        ServicioAlquiler sa = new ServicioAlquiler();

        sa.cargarCliente(sc);
        sa.elegirBarco(sc, barcos);
        sa.calcularAlquiler(barcos);
    }

}
