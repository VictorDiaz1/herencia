
package herenciaEj1.entidades;

import herenciaEj1.entidades.Animal;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String getAlimento() {
        return super.getAlimento(); //To change body of generated methods, choose Tools | Templates.
    }


    

}
