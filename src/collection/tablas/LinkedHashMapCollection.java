package collection.tablas;

import java.util.LinkedHashMap;

public class LinkedHashMapCollection {

    /**
     *
     *
     * Implementa la interfaz MAP
     * Almacena los elmentos con clave valor
     * Mantiene el orden de insercion
     * Permite  Clave y valor nulas
     *
     * Cuando usarlo
     *    Cuando necesitamos un orden por insercion
     *    Nodos
     *
     *
     */
    public static void main(String[] args) {
        LinkedHashMap<String , String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Lunes","Monday");
        linkedHashMap.put("Martes","Tuesday");
        linkedHashMap.put("Miercoles","Wednesday");

        var valueDeleted = linkedHashMap.remove("Miercoles");
        System.out.println(valueDeleted);
    }
}
