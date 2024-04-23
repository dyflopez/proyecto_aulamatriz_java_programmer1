package streams;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class PrincipalStreams {

    /**
     * Streams
     *
     *    Objeto que permite realizar de forma rapida y sensilla operaciones ;
     *      1) Busqueda
     *      2)  Fltrado
     *      3) Calculos
     *      4) Operaciones con el Collections
     *
     *      Para manipular un Stream se utiliza la interfaz Stream java.util.stream
     *      Stream : Recorre los datos desde el principio hasta el fin
     *      ***Una vez se cierra el Stream no se puede volver a usar***
     *
     *      Ventajas
     *
     *      1) Programacion declarativa : Permite escribir el odigo con un estilo mas comprensible y claro
     *      2) Operaciones funcionales : uso de interfaces funcionales ,
     *      3) Paralelismo :
     *      4) NO es mutable
     *      5) Tiene el manejo de altos volumenes de datos de una forma mas rapida
     *
     *
     *
     *    Streams tienen dos tipos de metodos
     *    1) Metodos intermedios :  Resuelven una operacion y develven un nuevo Stream
     *    2) Metodos finales:  Generan un resultado
     */
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);
        numeros.add(2);
        numeros.add(3);


        /**
         *  Dado un ArrayList , contar cuntos elementos tiene el arreglo
         */



        // Eliminen todos los elementos duplicados  / Muestren todos los elementos que no esten duplicados


        System.out.println(" impresion SET");
        Set<Integer> integerSet = new HashSet<>(numeros);

        integerSet.forEach(System.out::println);

        // STREAM
        System.out.println("******distinct*****");
        Stream<Integer>  noDuplicados= numeros.stream();

        // Forma 1
        noDuplicados
                .distinct()  // intermedio
                .forEach(System.out::println); // FINAL


        //Forma 2
        var listNotDuplicate = noDuplicados
                                .distinct()
                                .toList();

        System.out.println(listNotDuplicate);
        //Forma 3
        numeros
                .stream()
                .distinct()
                .forEach(System.out::println);

        //









    }
}
