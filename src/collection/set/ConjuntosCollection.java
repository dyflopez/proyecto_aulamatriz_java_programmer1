package collection.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosCollection {
    /**
     *
     * Los elementos no tienen posicion ni clave asicada
     * usa metodos como equals y hashCode
     * Viene de la interfaz SET
     * Su clase principal es hashSET
     *
     *  hashSet
     *  treeSet
     *  SET = es una interfaz que representa un elento unico
     *  No permiten elementos duplicados
     *  No tiene algun orden
     *
     */

    public static void main(String[] args) {

        int c=0b110_100;

        Set<String> frutas = new HashSet<>();
        frutas.add("Manzana");
        frutas.add("banano");
        frutas.add("Fresa");
        frutas.add("kiwi");
        frutas.add("Manzana");
        frutas.add("a");
        frutas.add("b");
        frutas.add("c");

        for (int i = 0; i < 5; i++) {
            System.out.println("**********");
            for (String fruta :frutas){
                System.out.println(fruta);
            }
        }

        System.out.println("**************************");
        frutas.forEach(System.out::println);
    }

    public static void sumar() {
    }











}
