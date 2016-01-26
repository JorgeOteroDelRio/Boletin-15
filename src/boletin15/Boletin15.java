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
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado(1,"Alejandro","Otero",26);
        Xogador xogador = new Xogador(2,"Jorge","Otero",19,11,"Delantero");
        Adestrador adestrador = new Adestrador(3,"Mario","Saldaña",19,"1A");
        Masaxista masaxista = new Masaxista(4,"Joaquín","Del Río",16,"Profesional",2);
        empleado.concentrarse();
        xogador.concentrarse();
        adestrador.concentrarse();
        masaxista.concentrarse();
        empleado.viaxar();
        xogador.viaxar();
        adestrador.viaxar();
        masaxista.viaxar(); 
        System.out.println(xogador.getEdade()); //Podemos llamar al método de una superclase desde una de sus subclases
        //No se puede invocar un método de una subclase desde su superclase
    }
    
}
