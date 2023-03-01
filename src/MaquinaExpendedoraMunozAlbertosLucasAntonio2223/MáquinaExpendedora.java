/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MaquinaExpendedoraMunozAlbertosLucasAntonio2223;

/**
 *
 * @author efech
 */

public class MáquinaExpendedora {

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the precio_maxMunozAlbertosLucasAntonio2223
     */
    public double getPrecio_maxMunozAlbertosLucasAntonio2223() {
        return precio_maxMunozAlbertosLucasAntonio2223;
    }

    /**
     * @param precio_maxMunozAlbertosLucasAntonio2223 the precio_maxMunozAlbertosLucasAntonio2223 to set
     */
    public void setPrecio_maxMunozAlbertosLucasAntonio2223(double precio_maxMunozAlbertosLucasAntonio2223) {
        this.precio_maxMunozAlbertosLucasAntonio2223 = precio_maxMunozAlbertosLucasAntonio2223;
    }
// Consideramos máquina snack precio único
    private int unidades;//número de snacks disponbles en la máquina expendora 
    private double precio;//precio actual de un snack
    private double precio_maxMunozAlbertosLucasAntonio2223;//precio máximo que puede tener un snack

    /*Constructor por defecto*/
    public MáquinaExpendedora() {
    
    }
    
    
     /*Constructor por parámetros*/
    public MáquinaExpendedora(int unidades, double precio, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.precio_maxMunozAlbertosLucasAntonio2223 = precio_max;
    }
    
    /*Método que devuelve el número de snack que tiene la máquina*/
    public int obtenerUnidades() {
        return this.unidades;
    }

    /*Método que devuelve el precio que tiene cada snack*/
    public double obtenerPrecio() {
        return this.getPrecio();
    }
    
     /*Método que permite modificar el número de snack dsiponbles de la máquina*/
    public void modificarUnidades(int unidades) {
        this.unidades = unidades;
    }
    
     /*Método que permite aumentar el precio de venta, suma al precio actual 
    el aumento que se indica siempre que no se sobrepase el precio máximo de venta*/
    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecio_maxMunozAlbertosLucasAntonio2223() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }
    
       
    
    /*Método que permite obtener un snack si se tiene suficiente dinero y hay 
suficientes unidades en la máquina*/
    public void sacarsnack(int unidades, double dinero, String regaloMunozAlbertosLucasAntonio) throws Exception {
        if (dinero <= 0) {
            throw new Exception("No puede introducirse un valor negativo para el dinero");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("La cantidad de snacks no puede ser negativa");
        }
        if (this.unidades <= unidades) {
            throw new Exception("No hay suficientes snack en la máquina");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }

}
