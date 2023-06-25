
package herenciaEj1.entidades;

import herenciaEj1.entidades.Animal;

public class Caballo extends Animal{

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String getAlimento() {
        return super.getAlimento(); //To change body of generated methods, choose Tools | Templates.
    }
    

}
