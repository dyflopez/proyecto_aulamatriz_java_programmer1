package streams.paralelos.parallelel;

import java.util.Arrays;

public class ParallelStreamMAin {

    /**
     * Es un flujo que permite realizar operaciones en paralelo con los
     * elementos de la coleccion .
     * se recmienda usar en multiprocesos
     * Usualmente tiene un mejor rendimeinto
     */

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int  sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
        /**
         *  Stream
         *
         *  1) procesamiento de un stream es secuencial
         *  2) se ejecuta un elemento a la vez
         *  3) se aconseja para el manejo de colecciones pequeñas o simples
         *  4) no tiene sobrecarga y su uso de memoria es normal
         *
         *  paraleller Stream
         *  1) el procesamiento se ejecutan hilos paralelo
         *  2) se ejecuta  varios elemenos simultaneamente
         *  3) se aconseja para el manejo de colecciones grandes o complejas
         *  4) su procesamiento exige una mejor configuacion de hardware
         *  y puede producir sobrecargas
         *
         *
         */
    }
}
