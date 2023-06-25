package herenciaEjExtra1.entidades;

import herenciaEjExtra1.entidades.Barco;

public class Yate extends Barco {

    private int potencia;
    private int cantCamarote;

    public Yate() {
    }

    public Yate(int potencia, int cantCamarote, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
        this.cantCamarote = cantCamarote;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCantCamarote() {
        return cantCamarote;
    }

    public void setCantCamarote(int cantCamarote) {
        this.cantCamarote = cantCamarote;
    }

    @Override
    public String toString() {
        return "Yate{" + "potencia=" + potencia + ", cantCamarote=" + cantCamarote + '}';
    }

}
