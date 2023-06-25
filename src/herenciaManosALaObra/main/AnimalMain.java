package herenciaManosALaObra.main;

import herenciaManosALaObra.entidades.Animal;
import herenciaManosALaObra.entidades.Gato;
import herenciaManosALaObra.entidades.Perro;
import java.util.ArrayList;

public class AnimalMain {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        animales.add(a);
        animales.add(b);
        animales.add(c);
        for (Animal animal : animales) {

            System.out.println(animal.hacerRuido());
        }
        a.caminar();

    }

}
