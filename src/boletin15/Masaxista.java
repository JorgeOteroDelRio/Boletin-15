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
public class Masaxista extends Empleado{
    private String titulacion;
    private int anosExperiencia;
    
    public Masaxista(int id,String nome,String apelidos,int edade,String titulacion,int anosExperiencia){
        super(id,nome,apelidos,edade);
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxa o masaxista");
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrase o masaxista");
    }

    @Override
    public String toString() {
        return super.toString() + "Titulacion: " + titulacion + ";" + "AñosExperiencia: " + anosExperiencia;
    }
    
    
}
