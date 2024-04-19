package iterables;

import java.util.ArrayList;
import java.util.Iterator;

public class IterablesMain {

    /***
     * 1) Objeto que puede hacer recoridos mediante un for
     * 2) Los objetos iterables implementan la interfaz Iterable
     * 3) Los metodos que usa Iterable son:
     *   * hasNext(): Indica si hay un elemento
     *   * next : se desplaza al siguiente elmento
     */

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");

        System.out.println("iteracion clasica");
        for(String elemento : lista){
            System.out.println(elemento);
        }

        Iterator<String>  iterator = lista.iterator();

       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }

    }
}
