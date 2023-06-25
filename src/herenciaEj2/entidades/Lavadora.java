package herenciaEj2.entidades;

import herenciaEj2.entidades.Electrodomestico;
import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, Double Precio, String color, char consumoEnergetico, Double peso) {
        super(Precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{"+super.toString() + "carga=" + carga + '}';
    }


    
    public Lavadora crearLavadora(Lavadora l) {
        Scanner sc = new Scanner(System.in);
        l.crearElectrodomestico(l);
        System.out.println("Ingrese le carga de la lavadora:");
        l.carga = sc.nextInt();
        return l;

    }

    @Override
    public void precioFinal(Electrodomestico e) {
        super.precioFinal(e);
        if (carga > 30) {
            e.Precio += 500d;
        }
    }

}
