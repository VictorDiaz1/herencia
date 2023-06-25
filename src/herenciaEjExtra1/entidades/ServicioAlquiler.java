package herenciaEjExtra1.entidades;

import herenciaEjExtra1.entidades.Velero;
import herenciaEjExtra1.entidades.Yate;
import herenciaEjExtra1.entidades.BarcoMotor;
import herenciaEjExtra1.entidades.Barco;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlquiler {

    private String nombreCliente;
    private String dniCliente;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco nombreBarco;

    public ServicioAlquiler() {
    }

    public ServicioAlquiler(String nombreCliente, String dniCliente, LocalDate fechaDeAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco nombreBarco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.nombreBarco = nombreBarco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(Barco nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    @Override
    public String toString() {
        return "SevicioAlquiler{" + "nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", nombreBarco=" + nombreBarco + '}';
    }

    public void cargarCliente(Scanner sc) {

        System.out.println("Ingrese su nombre: ");
        nombreCliente = sc.next();
        System.out.println("Ingrese su DNI: ");
        dniCliente = sc.next();
        System.out.println("Ingrese año, mes y dia de la fecha de alquiler: ");
        String anio = sc.next();
        String mes = sc.next();
        String dia = sc.next();
        fechaDeAlquiler = LocalDate.parse(anio + "-" + mes + "-" + dia);
        System.out.println("Ingrese año, mes y dia de la fecha de devolucion: ");
        String anioD = sc.next();
        String mesD = sc.next();
        String diaD = sc.next();
        fechaDevolucion = LocalDate.parse(anioD + "-" + mesD + "-" + diaD);
        System.out.println("Ingrese posicion de amarre: ");
        posicionAmarre = sc.nextInt();

    }

    public ArrayList elegirBarco(Scanner sc, ArrayList<Barco> barcos) {

        System.out.println("Elija un tipo de barco:\n1: Velero\n2: Barco a motor\n3: Yate");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                Barco vel = new Velero();
                barcos.add(vel);
                break;
            case 2:
                Barco bm = new BarcoMotor();
                barcos.add(bm);
                break;
            case 3:
                Barco y = new Yate();
                barcos.add(y);
                break;
        }
        for (Barco barco : barcos) {
            if (barco instanceof Velero) {
                System.out.println("Ingrese la eslora:");
                barco.setEslora(sc.nextInt());
                System.out.println("Ingrese el numero de mastiles: ");
                ((Velero) barco).setMastil(sc.nextInt());
            }
            if (barco instanceof BarcoMotor) {
                System.out.println("Ingrese la eslora: ");
                barco.setEslora(sc.nextInt());
                System.out.println("Ingrese la potencia en CV: ");
                ((BarcoMotor) barco).setPotencia(sc.nextInt());
            }
            if (barco instanceof Yate) {
                System.out.println("Ingrese la eslora: ");
                barco.setEslora(sc.nextInt());
                System.out.println("Ingrese la potencia en CV: ");
                ((Yate) barco).setPotencia(sc.nextInt());
                System.out.println("Ingrese el numero de camarotes:");
                ((Yate) barco).setCantCamarote(sc.nextInt());

            }

        }
        return barcos;

    }

    public void calcularAlquiler(ArrayList<Barco> barcos) {
        Period p = Period.between(fechaDeAlquiler, fechaDevolucion);
        System.out.println("Tiempo total del alquiler: ");
        System.out.println("Años: " + p.getYears());
        System.out.println("Meses: " + p.getMonths());
        System.out.println("Dias: " + p.getDays());
        Duration d = Duration.between(fechaDeAlquiler.atStartOfDay(), fechaDevolucion.atStartOfDay());
        System.out.println("Duracion total en dias: " + d.toDays() + " dias");
        int dias = (int) d.toDays();
        int alq = 0;
        for (Barco barco : barcos) {
            if (barco instanceof Velero) {
                alq = dias * (barco.getEslora() + ((Velero) barco).getMastil()) * 10;
            }
            if (barco instanceof BarcoMotor) {
                alq = dias * (barco.getEslora() + ((BarcoMotor) barco).getPotencia()) * 10;
            }
            if (barco instanceof Yate) {
                alq = dias * (barco.getEslora() + ((Yate) barco).getPotencia() + ((Yate) barco).getCantCamarote()) * 10;
            }
        }
        System.out.println("El alquiler del barco es: " + alq);

    }

}
