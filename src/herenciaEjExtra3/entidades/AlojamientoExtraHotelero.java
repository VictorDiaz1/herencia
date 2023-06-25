package herenciaEjExtra3.entidades;

import herenciaEjExtra3.entidades.Alojamiento;

public abstract class AlojamientoExtraHotelero extends Alojamiento {

    protected boolean privado;

    protected int perimetro;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(boolean privado, int perimetro, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.perimetro = perimetro;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "AlojamientoExtraHotelero{" + "privado=" + privado + ", perimetro=" + perimetro + '}';
    }

}
