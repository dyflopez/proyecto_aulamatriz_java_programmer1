package collection.tablas;

import java.util.TreeMap;

public class TreeMapCollection {

    /**
     * Impleplementacion de la interfaz SorteMap
     * Almacena valor de clave valor
     * Mantiene un orden natural  o se puede implementar un
     *      Comparator
     * No PERMITE Claves nulas pero valores si
     *
     * Cuando usamos un TreeMap
     *  Cuando nos intereasa el orden ascendentemente
     *  Necesitamos que las claves no sean nulas
     *
     *
     */
    public static void main(String[] args) {
        TreeMap<String,Integer> frutas = new TreeMap<>();
        frutas.put("manzana",20);
        frutas.put("banana",2);
        frutas.put("cereza",null);
        frutas.put("cereza",10);
        frutas.put("kiwi",null);

        for (String fruta : frutas.keySet()){
            System.out.println(fruta + "  "+frutas.get(fruta));
        }


    }
}
