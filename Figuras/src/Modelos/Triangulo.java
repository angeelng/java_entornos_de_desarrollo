
import java.util.*;

/**
 * 
 */
public class Triangulo {

    /**
     * Default constructor
     */
    public Triangulo() {
    	this.base = 1;
    	this.altura = 1;
    }

    /**
     * 
     */
    private int base;

    /**
     * 
     */
    public int altura;

    /**
     * @param base 
     * @param altura
     */
    public void Triangulo(int base, int altura) {
        // TODO implement here
    	this.base = base;
    	this.altura = altura;
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
        return this.base;
    }

    /**
     * @param altura int
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
        return this.altura;
    }
    public double getArea() {
    	double area = (this.base * this.altura)/2;
    	return area;
    }

}