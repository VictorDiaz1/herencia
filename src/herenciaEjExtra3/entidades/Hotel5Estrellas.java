package herenciaEjExtra3.entidades;

import herenciaEjExtra3.entidades.Hotel;

public class Hotel5Estrellas extends Hotel {

    private String gimnasio;

    private String nombreRestaurante;

    private int capacidadRestaurante;

    private int cantSalonesConferencia;

    private int cantSuites;

    private int cantLimusinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantSalonesConferencia, int cantSuites, int cantLimusinas, int cantHabitaciones, int cantCamas, int cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, cantCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimusinas = cantLimusinas;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
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

    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(int cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimusinas() {
        return cantLimusinas;
    }

    public void setCantLimusinas(int cantLimusinas) {
        this.cantLimusinas = cantLimusinas;
    }

    @Override
    public String toString() {
        return "hotel5Estrellas{" + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + ", cantSalonesConferencia=" + cantSalonesConferencia + ", cantSuites=" + cantSuites + ", cantLimusinas=" + cantLimusinas + '}';
    }

}
