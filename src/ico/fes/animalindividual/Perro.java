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
public class Perro extends Animal{
    private String raza;
    private int tiempoDePaseo;
    private String humor;
    private String colorDeCorrea;

    public Perro() {
    }

    public Perro(String raza, int tiempoDePaseo, String humor, String colorDeCorrea) {
        this.raza = raza;
        this.tiempoDePaseo = tiempoDePaseo;
        this.humor = humor;
        this.colorDeCorrea = colorDeCorrea;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getTiempoDePaseo() {
        return tiempoDePaseo;
    }

    public void setTiempoDePaseo(int tiempoDePaseo) {
        this.tiempoDePaseo = tiempoDePaseo;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    public String getColorDeCorrea() {
        return colorDeCorrea;
    }

    public void setColorDeCorrea(String colorDeCorrea) {
        this.colorDeCorrea = colorDeCorrea;
    }

    @Override
    public String toString() {
        return super.toString() + " Perro{" + "Raza: " + raza + ", tiempo de paseo en min: " + tiempoDePaseo + ", humor: " + humor + ", color de correa: " + colorDeCorrea + '}';
    }
   
    
           
}
