package herenciaEjExtra1.entidades;

import herenciaEjExtra1.entidades.Barco;

public class Velero extends Barco {

    private int mastil;

    public Velero() {
    }

    public Velero(int mastil, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastil = mastil;
    }

    public int getMastil() {
        return mastil;
    }

    public void setMastil(int mastil) {
        this.mastil = mastil;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastil=" + mastil + '}';
    }

}
