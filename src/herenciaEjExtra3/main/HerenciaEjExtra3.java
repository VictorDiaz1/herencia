package herenciaEjExtra3.main;

import herenciaEjExtra3.entidades.Alojamiento;
import herenciaEjExtra3.entidades.Hotel;
import herenciaEjExtra3.entidades.Hotel4Estrellas;
import herenciaEjExtra3.entidades.Hotel5Estrellas;
import java.util.ArrayList;

public class HerenciaEjExtra3 {

    public static void main(String[] args) {
        Hotel4Estrellas h4 = new Hotel4Estrellas();
        Hotel5Estrellas h5 = new Hotel5Estrellas();
        Hotel h4b = new Hotel4Estrellas();
        Hotel h5b = new Hotel5Estrellas();
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        //System.out.println(h4.calcularPrecioHabitacion(ArrayList a));
        h4.cargarDatosHotel(h4, alojamientos);
        System.out.println(h4.calcularPrecioHabitacion(alojamientos));
    }

}
