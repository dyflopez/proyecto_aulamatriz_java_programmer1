package collection.tablas;

import java.util.HashMap;

public class HashMapCollection {

    public static void main(String[] args) {
        /**
         *  HashMap es una implementacion de a intez  MAP
         *  su almacenamiento es por pares cale-valor
         *  No garantiza un orden de los elementos
         *  Permite claves y valores null
         *  No es sincrono (asincrono)
         * Cuando usarlo
         *  Cuando se neceista un mapeo de clave valor
         *  Cuando el orden no es necesario
         *  HaspMao ofrece un gran rendimiento
         *
         */

        HashMap<Integer,String> persona = new HashMap<>();

        persona.put(1,"daniel");
        persona.put(2,"yesid");
        persona.put(3,"florez");
        persona.put(null,null);

        for (Integer key  : persona.keySet()){
            System.out.println("persona "+ persona.get(key) + " key " + key);
        }
    }
}
