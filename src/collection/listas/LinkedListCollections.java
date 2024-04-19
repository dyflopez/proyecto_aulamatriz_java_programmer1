package collection.listas;

import java.util.LinkedList;

public class LinkedListCollections {


    /**
     * Es una implementacion  de  List y la interfaz Deque
     *  Almacena en nodos enlazados
     *  la insercion  y elminacion es un poco eficiente ya que trabaja con nodos
     *  No es Sincrono , no es recomendable para trabajar con concurrencia
     *
     *
     * Video estudio
     *
     * https://www.youtube.com/watch?v=F8AbOfQwl1c
     */
    public static void main(String[] args) {
        LinkedList<String> procesos  = new LinkedList<>();
        procesos.addLast("proceso 2");
        procesos.add("proceso 1");
        procesos.addFirst("proceso 0");

        procesos.forEach(System.out::println);
    }
}
