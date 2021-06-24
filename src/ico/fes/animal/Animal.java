/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animal;

/**
 *
 * @author LENOVO
 */
public class Animal {

    private int numeroDePatas;
    private int edad;
    private String colorDeOjos;
    private String nombre;

    public Animal() {
    }

    public Animal(int numeroPatas, int edad, String colorOjos, String nombre) {
        this.numeroDePatas = numeroPatas;
        this.edad = edad;
        this.colorDeOjos = colorOjos;
        this.nombre = nombre;
    }

    public int getNumeroPatas() {
        return numeroDePatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroDePatas = numeroPatas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColorOjos() {
        return colorDeOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorDeOjos = colorOjos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal{" + "Numero de patas: " + numeroDePatas + ", edad en años: " + edad  + ", color de ojos: " + colorDeOjos + ", nombre: " + nombre + '}';
    }
    public void emitirSonido(){
        System.out.println("Emitiendo sonido...");
        if (this.nombre.equals("Paris")){
            System.out.println("Guau");
        }
        else {
            System.out.println("Miaow");
        }
                
    }
}
