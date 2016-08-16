/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustnetacion;

import java.util.Scanner;


public class Producto {
    private String cantidad,nombre,precio;
    private Scanner leer; 

    public String getNombre() {
        return nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
        
        
    public void ingresar(){
        leer=new Scanner(System.in);        
        System.out.println("Ingrese el nombre del producto");
        nombre=leer.next();
        System.out.println("Ingrese la cantidad de este producto");
        cantidad=leer.next();
        System.out.println("Ingrese el precio del producto");
        precio=leer.next();
    }
    
    
}
