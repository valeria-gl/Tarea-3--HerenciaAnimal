/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animalindividual;

import ico.fes.animal.Animal;

/**
 *
 * @author LENOVO
 */
public class Gato extends Animal{
    private String raza;
    private float tamanioDeGarras;
    private int distanciaQueSalta;
    private boolean seEscapa;

    public Gato() {
    }

    public Gato(String raza, float tamanioDeGarras, int distanciaQueSalta, boolean seEscapa) {
        this.raza = raza;
        this.tamanioDeGarras = tamanioDeGarras;
        this.distanciaQueSalta = distanciaQueSalta;
        this.seEscapa = seEscapa;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getTamanioDeGarras() {
        return tamanioDeGarras;
    }

    public void setTamanioDeGarras(float tamanioDeGarras) {
        this.tamanioDeGarras = tamanioDeGarras;
    }

    public int getDistanciaQueSalta() {
        return distanciaQueSalta;
    }

    public void setDistanciaQueSalta(int distanciaQueSalta) {
        this.distanciaQueSalta = distanciaQueSalta;
    }

    public boolean isSeEscapa() {
        return seEscapa;
    }

    public void setSeEscapa(boolean seEscapa) {
        this.seEscapa = seEscapa;
    }

    @Override
    public String toString() {
        return super.toString() + " Gato{" + "Raza: " + raza + ", tamaño de garras en cm: " + tamanioDeGarras + ", distancia que salta en cm: " + distanciaQueSalta + ", ¿se escapa?: " + seEscapa + '}';
    }
    
   
    
}
