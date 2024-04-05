package clases.anidadas;

import com.sun.tools.javac.Main;

public class ClasesEstaticasAnidadas {

    /***
     * Son clases estaticas que estan anidadas dentro de otra clase
     * No tienen acceso a los miembros no estaticos de la clase contenedora
     */


    static class ClaseAnidada{
        public void showMenssage(){
            System.out.println("mensaje");
        }

        public static void showMenssageDos(){
            System.out.println("mensaje");
        }
    }

    public static void main(String[] args) {
        ClasesEstaticasAnidadas clasesEstaticasAnidadas = new ClasesEstaticasAnidadas();
        ClasesEstaticasAnidadas.ClaseAnidada.showMenssageDos();

        ClasesEstaticasAnidadas.ClaseAnidada claseAnidada =  new ClasesEstaticasAnidadas.ClaseAnidada();
        claseAnidada.showMenssage();
    }
}
