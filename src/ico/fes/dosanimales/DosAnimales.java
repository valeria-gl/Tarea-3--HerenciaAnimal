/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.dosanimales;
import ico.fes.animalindividual.Gato;
import ico.fes.animalindividual.Perro;

/**
 *
 * @author LENOVO
 */
public class DosAnimales {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Yorkshire Terrier", 15, "Feliz", "Rosa");
        perro1.setNumeroPatas(4);
        perro1.setEdad(10);
        perro1.setColorOjos("Café");
        perro1.setNombre("Paris");
        System.out.println(perro1);
        perro1.emitirSonido();
        
        Gato gato1 = new Gato("Fold escocés", 0.5f, 50, false);
        gato1.setNumeroPatas(4);
        gato1.setEdad(4);
        gato1.setColorOjos("Amarillo");
        gato1.setNombre("Pelos");
        System.out.println(gato1);
        gato1.emitirSonido();
        
        
       
    }
    
}
