package collection.listas;

import java.util.ArrayList;

public class ListasCollection {

    /**
     * 1) Cada elemento tiene una posicion a partir del orden de llegada
     * 2) Son colecciones de tipo generico <T>
     *
     *
     * 1) ArrayList
     * 2) List
     * 3) Vector
     * 4) LinkedList
     */

    public void teorioraArrayList(){
        //ArrayList
        /**
         * caracteristicas de un arrayList
         * 1) Ofece el acceo por medio de indices
         * 2) su reocorrido no es sincrono : no se aconseja para la ejecucion
         * de subproesos en entornos conurrentes  (es mejor que un vector)
         *
         * ArrayList Implementacion :
         * ArrayList es una implemetaciom de la interfaz List
         *
         */
        ArrayList<String> personas = new ArrayList<>();

        personas.add("daniel");
        personas.add("gustavo");

        personas.forEach(System.out::println);

        /**
         *
         * Interfaz : plantilla , es un conjunto de metodos que deben ser implementados
         * Imlementacion : Ofrece  la logica apartir de una interfa , es la que se imlementa
         */
    }
}
