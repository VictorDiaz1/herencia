package herenciaEj4.main;

import herenciaEj4.entidades.Circulo;
import herenciaEj4.entidades.Rectangulo;
import java.util.Scanner;

public class HerenciaEj4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ingrese el radio:");
        circulo.setRadio(sc.nextInt());
        System.out.println("area = " + circulo.calcularArea());
        System.out.println("perimetro = " + circulo.calcularPerimetro());
        System.out.println("Ingrese la base del rectangulo: ");
        rectangulo.setBase(sc.nextInt());
        System.out.println("Ingrese la altura del rectangulo: ");
        rectangulo.setAltura(sc.nextInt());
        System.out.println("Area rectangulo= " + rectangulo.calcularArea());
        System.out.println("Perimetro rectangulo = " + rectangulo.calcularPerimetro());

    }

}
