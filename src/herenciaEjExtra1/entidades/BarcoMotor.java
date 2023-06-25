package herenciaEjExtra1.entidades;

import herenciaEjExtra1.entidades.Barco;

public class BarcoMotor extends Barco {

    private int potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(int potencia, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potencia=" + potencia + '}';
    }

}
