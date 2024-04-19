package collection.listas;

import java.util.Vector;

public class VectorCollection {

    /**
     *
     *  Vector es sincrono
     *  no tiene que pasar por cada posicion para llegar a su elemento
     *  su rendimiento es un poco mejor por su sincronia
     *
     *  El vector redimenciona dinamico  , va creciendo a medida
     */

    public void ejemploVector(){
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.forEach(System.out::println);
    }
}
