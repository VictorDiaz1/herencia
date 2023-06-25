package herenciaEjExtra2.main;

import herenciaEjExtra2.entidades.Edificio;
import herenciaEjExtra2.entidades.EdificioDeOficinas;
import herenciaEjExtra2.entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

public class HerenciaEjExtra2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Edificio> edificios = new ArrayList();
        int opcion;
        String respuesta, resp;
        do {
            do {
                Polideportivo pd = new Polideportivo();
                EdificioDeOficinas eo = new EdificioDeOficinas();
                System.out.println("Ingrese un edificio: ");
                System.out.println("1: Edifico de oficinas.");
                System.out.println("2: Polideportivo. ");
                opcion = sc.nextInt();
                if (opcion == 1) {
                    System.out.println("Ingrese la cantidad de oficinas por piso: ");
                    eo.setOficinas(sc.nextInt());
                    System.out.println("Ingrese la cantidad de personas que trabajan en una oficina: ");
                    eo.setPersonas(sc.nextInt());
                    System.out.println("Ingrese la altura: ");
                    eo.setAlto(sc.nextInt());
                    System.out.println("Ingrese el ancho: ");
                    eo.setAncho(sc.nextInt());
                    System.out.println("Ingrese el largo: ");
                    eo.setLargo(sc.nextInt());
                    System.out.println("Ingrese la cantidad dde pisos:");
                    eo.setPisos(sc.nextInt());
                    edificios.add(eo);
                } else if (opcion == 2) {
                    System.out.println("Ingrese el nombre: ");
                    pd.setNombre(sc.next());
                    System.out.println("Ingrese la altura: ");
                    pd.setAlto(sc.nextInt());
                    System.out.println("Ingrese el ancho: ");
                    pd.setAncho(sc.nextInt());
                    System.out.println("Ingrese el largo: ");
                    pd.setLargo(sc.nextInt());
                    System.out.println("Indique si es techado s/n");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        pd.setTipoInstalacion("Techado");
                        System.out.println("El edificio es techado");
                    } else {
                        pd.setTipoInstalacion("Abierto");
                        System.out.println("El edificio es abierto");
                    }
                    edificios.add(pd);
                }

            } while (opcion < 1 || opcion > 2);
            System.out.println("Desea agregar otro edificio? s/n ");
            resp = sc.next();
        } while (resp.equalsIgnoreCase("s"));
        for (Edificio edificio : edificios) {
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            if (edificio instanceof Polideportivo) {
                System.out.println("tipo de instalación: " + ((Polideportivo) edificio).getTipoInstalacion());
            }
            if (edificio instanceof EdificioDeOficinas) {
                ((EdificioDeOficinas) edificio).cantidadPersonas();
            }

        }
        System.out.println("Edificios: " + edificios.toString());

    }

}
