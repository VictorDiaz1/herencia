package herenciaEjExtra2.entidades;

import herenciaEjExtra2.entidades.Edificio;

public class Polideportivo extends Edificio {

    private String nombre;
    private String tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalacion) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion + '}';
    }

    @Override
    public void calcularSuperficie() {
        double superficie = largo * ancho;
        System.out.println("La superficie del polideportivo es: " + superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen = alto * ancho * largo;
        System.out.println("El volumen del polideportivo es: " + volumen);

    }

}
