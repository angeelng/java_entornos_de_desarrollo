package Modelos.Model;

import java.util.*;

/**
 * 
 */
public class rectangulo {

    /**
     * Default constructor
     */

    /**
     * 
     */
    private int base;

    /**
     * 
     */
    private int altura;

    /**
     * @param base  
     * @param altura
     */
    public rectangulo(int base , int altura) {
        // TODO implement here
    	this.base = base;
    	this.altura = altura;
    }

    /**
     * @param base 
     * @param altura
     */
    public rectangulo() {
        // TODO implement here
    	this.base = 1;
    	this.altura = 1;
    	}

    /**
     * @param base
     */
    public void setBase(int base) {
        // TODO implement here
    	this.base = base;
    }

    /**
     * @return
     */
    public int getBase() {
        // TODO implement here
        return base;
    }

    /**
     * @param altura
     */
    public void setAltura(int altura) {
        // TODO implement here
    	this.altura = altura;
    }

    /**
     * @return
     */
    public int getAltura() {
        // TODO implement here
        return altura;
    }

    /**
     * @param base 
     * @param altura
     */
    public int getPerimetro() {
        // TODO implement here
    	int perimetro = 2 * this.base + 2 * this.altura;
    	return perimetro;
    }
    public int getArea () {
    	int area = this.base * this.altura;
    	return area;
    }

}