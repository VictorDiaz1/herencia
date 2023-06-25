package herenciaEjExtra3.entidades;

import herenciaEjExtra3.entidades.Hotel;
import herenciaEjExtra3.entidades.Alojamiento;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel4Estrellas extends Hotel {

    private char tipoGimnasio;

    private String nombreRestaurante;

    private int capacidadRestaurante;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(char gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int cantCamas, int cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, cantCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.tipoGimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public char getTipoGimnasio() {
        return tipoGimnasio;
    }

    public void setTipoGimnasio(char tipoGimnasio) {
        this.tipoGimnasio = tipoGimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return "hotel4Estrellas{" + "gimnasio=" + tipoGimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }

    public ArrayList cargarDatosHotel(Hotel4Estrellas h4, ArrayList<Alojamiento> alojamientos) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del hotel: ");
        h4.setNombre(sc.next());
        System.out.println("Ingrese el nombre del gerente del hotel: ");
        h4.setGerente(sc.next());
        System.out.println("Ingrese la localidad: ");
        h4.setLocalidad(sc.next());
        System.out.println("Ingrese la direccion: ");
        h4.setDireccion(sc.next());
        System.out.println("Ingrese la cantidad de pisos del hotel: ");
        h4.setCantPisos(sc.nextInt());
        System.out.println("Ingrese la cantidad de habitaciones por piso: ");
        h4.setCantHabitaciones(sc.nextInt());
        System.out.println("Ingrese la cantidad de camas por Habitacion: ");
        h4.setCantCamas(sc.nextInt());
        System.out.println("Ingrese el nombre del restaurante: ");
        h4.setNombreRestaurante(sc.next());
        System.out.println("Ingrese la capacidad del restaurante: ");
        h4.setCapacidadRestaurante(sc.nextInt());
        System.out.println("Ingrese el tipo de gimnasio a/b. ");
        h4.setTipoGimnasio(sc.next().charAt(0));
        alojamientos.add(h4);
        return alojamientos;

    }

    @Override
    public double calcularPrecioHabitacion(ArrayList<Alojamiento> alojamientos) {
        int valorAgregRest;
        int valorAgregGim = 0;
        if (true) {

        }
        double precioFinal = 0;
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel4Estrellas) {
                if (((Hotel4Estrellas) alojamiento).getCapacidadRestaurante() < 30) {
                    valorAgregRest = 10;
                } else if (((Hotel4Estrellas) alojamiento).getCapacidadRestaurante() <= 50) {
                    valorAgregRest = 30;
                } else {
                    valorAgregRest = 50;
                }
                if (((Hotel4Estrellas) alojamiento).getTipoGimnasio() == ('A')) {
                    valorAgregGim = 50;
                }
                if (((Hotel4Estrellas) alojamiento).getTipoGimnasio() == ('B')) {
                    valorAgregGim = 30;
                }

                precioFinal = super.calcularPrecioHabitacion(alojamientos) + (((Hotel4Estrellas) alojamiento).getCantCamas()
                        * ((Hotel4Estrellas) alojamiento).getCantHabitaciones() * ((Hotel4Estrellas) alojamiento).getCantPisos())
                        + valorAgregRest + valorAgregGim;
            }
        }

        return precioFinal;
    }

}
