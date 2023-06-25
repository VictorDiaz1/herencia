package herenciaEjExtra3.entidades;

import herenciaEjExtra3.entidades.Alojamiento;
import java.util.ArrayList;

public abstract class Hotel extends Alojamiento {

    protected int cantHabitaciones;

    protected int cantCamas;

    protected int cantPisos;

    protected Double precioHabitacion;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int cantCamas, int cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return "Hotel{" + "cantHabitaciones=" + cantHabitaciones + ", cantCamas=" + cantCamas + ", cantPisos=" + cantPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }

    public double calcularPrecioHabitacion(ArrayList<Alojamiento> alojamientos) {
        this.setPrecioHabitacion(50.0);
        return precioHabitacion;
    }
}
