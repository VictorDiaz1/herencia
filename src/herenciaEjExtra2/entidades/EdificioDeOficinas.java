package herenciaEjExtra2.entidades;

import herenciaEjExtra2.entidades.Edificio;
import java.util.Scanner;

public class EdificioDeOficinas extends Edificio {

    private int oficinas;
    private int personas;
    private int pisos;
    Scanner sc = new Scanner(System.in);

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int oficinas, int personas, int pisos) {
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public EdificioDeOficinas(int oficinas, int personas, int pisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "oficinas=" + oficinas + ", personas=" + personas + ", pisos=" + pisos + '}';
    }

    @Override
    public void calcularSuperficie() {
        double superficie = largo * ancho;
        System.out.println("La superficie del edificio de oficinas es: " + superficie);

    }

    @Override
    public void calcularVolumen() {
        double volumen = alto * ancho * largo * pisos;
        System.out.println("El volumen del edificio de oficinas es: " + volumen);
    }

    public void cantidadPersonas() {
        int personasTotalPisos = personas * oficinas;
        int personasTotalEdificio = personasTotalPisos * pisos;
        System.out.println("La cantidad de personas que entran en un piso son: " + personasTotalPisos);
        System.out.println("La cantidad de personas que entran en el edificio son: " + personasTotalEdificio);
    }

}
