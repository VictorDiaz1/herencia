package herenciaEj4.entidades;

import herenciaEj4.entidades.CalculosFormas;

public class Rectangulo implements CalculosFormas {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public double calcularArea() {
        double area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (base + altura) * 2;
        return perimetro;
    }

}
