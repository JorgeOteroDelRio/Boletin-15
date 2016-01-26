/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

/**
 *
 * @author Jota
 */
public class Adestrador extends Empleado{
    private String idFederacion;
    
    public Adestrador(int id,String nome,String apelidos,int edade,String idFederacion){
        super(id,nome,apelidos,edade);
        this.idFederacion=idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxa o adestrador");
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrase o adestrador");
    }
    
    public void dirixirPartido(){
        System.out.println("Entrenador dirixe o partido");
    }
    
    public void dirixirAdestramento(){
        System.out.println("Entrenador dirixe o adestramento");
    }

    @Override
    public String toString() {
        return super.toString() + "IdFederacion: " + idFederacion;
    }
    
    
}
