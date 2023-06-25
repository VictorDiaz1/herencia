package herenciaEj2.entidades;

import herenciaEj2.entidades.Electrodomestico;
import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizadorTDT, Double Precio, String color, char consumoEnergetico, Double peso) {
        super(Precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor{" +super.toString()+ "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }



    public void crearTelevisor(Televisor t) {
        Scanner sc = new Scanner(System.in);
        t.crearElectrodomestico(t);
        System.out.println("Ingrese la resolución: ");
        t.resolucion = sc.nextDouble();
        System.out.println("Indique si tiene sintonizador TDT s/n:");
        String opcion = sc.next();
        t.sintonizadorTDT = opcion.equalsIgnoreCase("s");

    }

    @Override
    public void precioFinal(Electrodomestico e) {
        super.precioFinal(e);
        if (resolucion > 40) {
            e.Precio *= 1.3;
        }
        if (sintonizadorTDT) {
            e.Precio += 500d;
        }
    }

}
