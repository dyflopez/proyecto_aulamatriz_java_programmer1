package lambdas.interfaz.funcional;

import java.util.UUID;
import java.util.function.Supplier;

public class ISupplier {

    /**
     * 1) Dispone del metodo abstracto "get" que no recibe ningun parametro
     *  y devuelve un Obetos , Cualquier cosa
     * 2) Produce un valor sin necesidad de recibir algun parametro
     *
     * Supplier<T>
     *
     */
    public static  Supplier<UUID> generateUUIDStatic = ()-> UUID.randomUUID();

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "hola";

        System.out.println(supplier.get());

        /**
         * Buscar un objetivo
         *
* Generar UUID  Aleatorios para la incersion del un usuario unico  base datos
         */

        Supplier<Integer> generateRandomNumbers= ()-> (int) (Math.random()*100);

        UUID num;
        for(int i=0;i<20;i++){
            num=generateUUIDStatic.get();
            System.out.println(num);
        }
    }
}
