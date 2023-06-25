package herenciaEjExtra3.entidades;

import herenciaEjExtra3.entidades.AlojamientoExtraHotelero;

public class Camping extends AlojamientoExtraHotelero {

    private int capacidadMaxCarpas;

    private int cantBanios;

    private boolean restaurante;

    public Camping() {
    }

    public Camping(int capacidadMaxCarpas, int cantBanios, boolean restaurante, boolean privado, int perimetro, String nombre, String direccion, String localidad, String gerente) {
        super(privado, perimetro, nombre, direccion, localidad, gerente);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public int getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(int capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "capacidadMaxCarpas=" + capacidadMaxCarpas + ", cantBanios=" + cantBanios + ", restaurante=" + restaurante + '}';
    }

}
