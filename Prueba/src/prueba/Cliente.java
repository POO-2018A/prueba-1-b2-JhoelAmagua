/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

public class Cliente {
    
    String nombre;
    Fruta fruta;

    public Cliente(String nombre, Fruta fruta) {
        this.nombre = nombre;
        this.fruta = fruta;
    }

    Cliente(String nombrecliente, String fruta) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }
  
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
}
