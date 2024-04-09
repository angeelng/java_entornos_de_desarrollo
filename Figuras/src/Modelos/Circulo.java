package Modelos.Model;

import java.util.*;

/**
 * 
 */
public class Circulo {

    /**
     * Default constructor
     */
    public Circulo() {
    	this.radio = 1;
    }

    /**
     * 
     */
    private int radio;

    /**
     * @param radio
     */
    public void Circulo(int radio) {
        // TODO implement here
    	this.radio = radio;
    }

    /**
     * @param radio
     */
    public void setRadio(int radio) {
        // TODO implement here
    	this.radio = radio;
    }

    /**
     * @return
     */
    public int getRadio() {
        // TODO implement here
        return this.radio;
    }
    public double getArea() {
    	double area =  3.14 * (this.radio * this.radio);
    	return area;
    }
    public double getPerimetro() {
    	double perimetro = 2 * 3.14 * this.radio;
    	return perimetro;
    }

}