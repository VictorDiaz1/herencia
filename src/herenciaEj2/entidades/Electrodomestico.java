package herenciaEj2.entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected Double Precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double Precio, String color, char consumoEnergetico, Double peso) {
        this.Precio = Precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return " Precio=" + Precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso ;
    }

    public void comprobarConsumoEnergetico(char l) {
        if (l == 'a' || l == 'b' || l == 'c' || l == 'd' || l == 'e') {
            this.consumoEnergetico = l;
        } else {
            this.consumoEnergetico = 'f';
        }
        System.out.println("consumoEnergetico = " + consumoEnergetico);

    }

    public String comprobarColor(String c) {
        if (c.equalsIgnoreCase("negro") || c.equalsIgnoreCase("rojo") || c.equalsIgnoreCase("azul") || c.equalsIgnoreCase("gris")) {
            this.color = c;
        } else {
            this.color = "blanco";
        }
        System.out.println("color = " + color);
        return color;
    }

    public Electrodomestico crearElectrodomestico(Electrodomestico e) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una letra para comprobar el consumo energetico:");
        e.comprobarConsumoEnergetico(sc.next().charAt(0));
        System.out.println("Ingrese el color: ");
        e.comprobarColor(sc.next());
        System.out.println("Ingrese el peso: ");
        e.peso = sc.nextDouble();
        e.Precio = 1000.0;
        return e;

    }

    public void precioFinal(Electrodomestico e) {
        double pf = 1000.0;
        switch (consumoEnergetico) {
            case 'a':
                pf += 1000d;
                break;
            case 'b':
                pf += 800.0;
                break;
            case 'c':
                pf += 600d;
                break;
            case 'd':
                pf += 500d;
                break;
            case 'e':
                pf += 300d;
                break;
            case 'f':
                pf += 100d;
                break;

        }
        pf += (peso <= 19) ? 100d : (peso > 19 && peso <= 49) ? 500d : (peso > 49 && peso <= 79) ? 800d : 1000d;
        Precio = pf;
    }

}
