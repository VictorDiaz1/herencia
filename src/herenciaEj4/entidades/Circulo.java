package herenciaEj4.entidades;

import herenciaEj4.entidades.CalculosFormas;

public class Circulo implements CalculosFormas {

    private int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public double calcularArea() {
        double area = p * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = p * (radio * 2);
        return perimetro;
    }

}
