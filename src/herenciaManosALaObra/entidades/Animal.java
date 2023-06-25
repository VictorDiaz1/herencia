
package herenciaManosALaObra.entidades;

import herenciaManosALaObra.interfaces.AccionAnimal;

public class Animal implements AccionAnimal {

    public Animal() {
    }
    public String hacerRuido(){                
        return "Hola"; 
    }

    @Override
    public void caminar() {
        System.out.println("hola");
    }

}
