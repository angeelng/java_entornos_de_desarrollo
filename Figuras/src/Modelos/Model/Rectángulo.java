
import java.util.*;

/**
 * 
 */
public class Rectángulo {

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
    public Rectángulo(int base , int altura) {
        // TODO implement here
    	this.base = base;
    	this.altura = altura;
    }

    /**
     * @param base 
     * @param altura
     */
    public Rectángulo() {
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
    public int getPerimetro(int base, int altura) {
        // TODO implement here
    	int perimetro = 2 * base + 2 * altura;
    	return perimetro;
    }
    public int getArea (int base, int altura) {
    	int area = base * altura;
    	return area;
    }

}