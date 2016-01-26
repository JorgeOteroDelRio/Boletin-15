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
public class Xogador extends Empleado{
    private int dorsal;
    private String demarcacion;

    public Xogador(int id,String nome,String apelido,int edade,int dorsal,String demarcacion){
        super(id,nome,apelido,edade);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentranse os xogadores");
    }
    
    @Override
    public void viaxar() {
        System.out.println("Viaxan os xogadores");
    }
    
    public void xogarPartido(){
        System.out.println("Xogan o partido");
    }
    
    public void entrenar(){
        System.out.println("Entrenan os xogadores");
    }

    @Override
    public String toString() {
        return super.toString() + "Dorsal: " + dorsal + ";" + "Demarcacion: " + demarcacion;
    }
    
    
}
