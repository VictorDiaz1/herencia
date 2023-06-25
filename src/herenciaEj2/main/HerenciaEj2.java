package herenciaEj2.main;

import herenciaEj2.entidades.Electrodomestico;
import herenciaEj2.entidades.Lavadora;
import herenciaEj2.entidades.Televisor;
import java.util.ArrayList;

public class HerenciaEj2 {

    public static void main(String[] args) {

        Electrodomestico e = new Electrodomestico();
        Electrodomestico b = new Electrodomestico();
        Lavadora lav = new Lavadora();
        Televisor tel = new Televisor();
        Lavadora lav1 = new Lavadora();
        Televisor tel2 = new Televisor();

        lav.crearLavadora(lav);
        //lav.precioFinal(lav);
        lav1.crearLavadora(lav1);
        //lav1.precioFinal(lav1);
        tel.crearTelevisor(tel);
        //tel.precioFinal(tel);
        tel2.crearTelevisor(tel2);
        //tel2.precioFinal(tel2);

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        electrodomesticos.add(lav);
        electrodomesticos.add(lav1);
        electrodomesticos.add(tel);
        electrodomesticos.add(tel2);
        for (Electrodomestico electro : electrodomesticos) {
            electro.precioFinal(electro);
            System.out.println(electro.getPrecio());
        }
        System.out.println("electrodomesticos =\n " + electrodomesticos.toString());
        double suma = 0;
        double suma2 = 0;
        for (Electrodomestico electro : electrodomesticos) {
            if (electro instanceof Lavadora) {
                suma += electro.getPrecio();
            } else {
                suma2 += electro.getPrecio();
            }
        }

        System.out.println("El valor total de las lavadoras es " + suma);
        System.out.println("El valor total de los televisores es " + suma2);
        System.out.println("El valor total de los electrodomesticos es " + (suma + suma2));

    }

}
